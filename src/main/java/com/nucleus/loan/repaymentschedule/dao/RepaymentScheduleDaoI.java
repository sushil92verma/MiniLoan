package com.nucleus.loan.repaymentschedule.dao;

import com.nucleus.loan.repaymentschedule.model.RepaymentSchedule;

import java.util.List;

public interface RepaymentScheduleDaoI
{
    void addRepaymentSchedule(List<RepaymentSchedule> repaymentSchedule);
    List<RepaymentSchedule> getRepaymentSchedule(String loanApplicationNo);
}
