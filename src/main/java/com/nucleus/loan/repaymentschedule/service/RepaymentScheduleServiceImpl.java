package com.nucleus.loan.repaymentschedule.service;

import com.nucleus.loan.repaymentschedule.dao.RepaymentScheduleDaoI;
import com.nucleus.loan.repaymentschedule.model.LoanApplication;
import com.nucleus.loan.repaymentschedule.model.RepaymentSchedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class RepaymentScheduleServiceImpl implements RepaymentScheduleServiceI
{
    @Autowired
    private RepaymentScheduleDaoI repaymentScheduleDao;
    private static DecimalFormat df2 = new DecimalFormat("#.##");


    @Transactional
    @Override
    public void addRepaymentSchedule(LoanApplication loanApplication)
    {
        RepaymentScheduleServiceImpl repaymentScheduleService = new RepaymentScheduleServiceImpl();
        repaymentScheduleDao.addRepaymentSchedule(repaymentScheduleService.generateRepaymentSchedule(loanApplication));
    }

    @Transactional
    @Override
    public List<RepaymentSchedule> getRepaymentSchedule(String loanApplicationNo)
    {
        return repaymentScheduleDao.getRepaymentSchedule(loanApplicationNo);
    }

    public double calculateEmi(double loanAmountRequested, double rate, int tenure)
    {
        double emi = (loanAmountRequested * ((rate/100) / 12)) / (1 - (1 / Math.pow((1 + ((rate/100) / 12)), (tenure*12))));
        return Double.parseDouble(df2.format(emi));
    }


    public List<RepaymentSchedule> generateRepaymentSchedule(LoanApplication loanApplication)
    {
        RepaymentScheduleServiceImpl repaymentScheduleService = new RepaymentScheduleServiceImpl();
        double emi = repaymentScheduleService.calculateEmi(loanApplication.getLoanAmountRequested(), loanApplication.getRate(), loanApplication.getTenure());
        int installmentNo = 0;
        double closingBalance = 0;
        List<RepaymentSchedule> repaymentSchedule  = new ArrayList<>();

        while (true) {
            RepaymentSchedule installment = new RepaymentSchedule();
            installment.setInstallmentNo(loanApplication.getLoanApplicationNumber().concat("_" + ++installmentNo));
            installment.setLoanApplication(loanApplication);
            installment.setOpeningBalance(Double.parseDouble(df2.format(loanApplication.getLoanAmountRequested())));

            if (installmentNo != 1) {
                installment.setOpeningBalance(Double.parseDouble(df2.format(closingBalance)));
            }
            installment.setInterestComponent(Double.parseDouble(df2.format(installment.getOpeningBalance() * (loanApplication.getRate() / 100.0) * (1.0 / 12.0))));
            installment.setPrincipalComponent(Double.parseDouble(df2.format(emi - installment.getInterestComponent())));
            installment.setEmi(emi);
            installment.setEmiStatus("PENDING");
            closingBalance = installment.getOpeningBalance() - installment.getPrincipalComponent();
            installment.setClosingBalance(Double.parseDouble(df2.format(closingBalance)));
            installment.setDueDate(loanApplication.getInstallmentDueDate());
            installment.setBillFlag('Y');
            repaymentSchedule.add(installment);

            if (installment.getOpeningBalance() < emi)
            {
                installment.setClosingBalance(0);
                break;
            }

        }
        return repaymentSchedule;
    }
}
