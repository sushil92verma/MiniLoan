package com.nucleus.loan.repaymentschedule.service;

import com.nucleus.loan.repaymentschedule.model.LoanApplication;
import com.nucleus.loan.repaymentschedule.model.RepaymentSchedule;

import java.util.List;

public interface RepaymentScheduleServiceI
{
    void addRepaymentSchedule(LoanApplication loanApplication);
    List<RepaymentSchedule> getRepaymentSchedule(String loanApplicationNo);
}
