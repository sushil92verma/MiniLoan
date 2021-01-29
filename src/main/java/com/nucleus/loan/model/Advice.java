package com.nucleus.loan.model;

import javax.persistence.ManyToOne;
import java.util.Date;

public class Advice {
    private int adviceId;
    private int amountDue;
    private String type;
    private String status;
    private String adviceType;
    private Date adviceDate;
    @ManyToOne
    private RepaymentSchedule loanApplicationNumber;
    @ManyToOne
    private RepaymentSchedule installmentNo;

}
