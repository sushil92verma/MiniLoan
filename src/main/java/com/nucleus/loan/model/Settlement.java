package com.nucleus.loan.model;

import javax.persistence.ManyToOne;

public class Settlement {
    private int paymentId;
    private int amountPaid;
    private int amountDue;
    private String status;
    @ManyToOne
    private Advice adviceId;
    @ManyToOne
    private Receipts receiptNo;

}
