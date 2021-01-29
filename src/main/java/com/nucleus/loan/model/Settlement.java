package com.nucleus.loan.model;

import javax.persistence.ManyToOne;

public class Settlement {
    private int PaymentId;
    private int AmountPaid;
    private int AmountDue;
    private String Status;
    @ManyToOne
    private Advice AdviceId;
    @ManyToOne
    private Reciept RecieptNo;

}
