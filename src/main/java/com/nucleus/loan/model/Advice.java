package com.nucleus.loan.model;

import javax.persistence.ManyToOne;
import java.util.Date;

public class Advice {
    private int AdviceId;
    private int AmountDue;
    private String Type;
    private String Status;
    private String AdviceType;
    private Date AdviceDate;
    @ManyToOne
    private RepaymentSchedule LoanApplicationNo;
    @ManyToOne
    private RepaymentSchedule InstallmentNo;

}
