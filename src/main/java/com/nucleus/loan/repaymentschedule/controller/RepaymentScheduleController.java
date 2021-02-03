package com.nucleus.loan.repaymentschedule.controller;

import com.nucleus.loan.repaymentschedule.model.LoanApplication;
import com.nucleus.loan.repaymentschedule.model.RepaymentSchedule;
import com.nucleus.loan.repaymentschedule.service.RepaymentScheduleServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Date;
import java.util.List;

@Controller
public class RepaymentScheduleController
{
    @Autowired
    private RepaymentScheduleServiceI repaymentScheduleService;

    @GetMapping("/")
    public String getRepaymentSchedulePage()
    {
        return "repaymentScheduleHome";
    }


    @GetMapping("/add")
    public String addRepaymentSchedulePage(@ModelAttribute("loan") String loan)
    {
        LoanApplication loanApplication = new LoanApplication();
        loanApplication.setLoanApplicationNumber(loan);
        loanApplication.setLoanAmountRequested(250000);
        loanApplication.setRate(12);
        loanApplication.setTenure(20);
        loanApplication.setInstallmentDueDate(new Date());
        repaymentScheduleService.addRepaymentSchedule(loanApplication);
        return "repaymentScheduleHome";
    }

    @GetMapping("generatedRepaymentSchedule")
    public String showRepaymentSchedule(@ModelAttribute("loanApplicationNo") String loanApplicationNo, Model model)
    {
        List<RepaymentSchedule> repaymentSchedules = repaymentScheduleService.getRepaymentSchedule(loanApplicationNo);
        for (RepaymentSchedule rs : repaymentSchedules)
        {
            rs.setInstallmentNo(rs.getInstallmentNo().substring(rs.getInstallmentNo().indexOf("_")+1));
        }

        model.addAttribute("repaymentSchedule", repaymentSchedules);
        return "repaymentScheduleReport";
    }
}
