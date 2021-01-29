package com.nucleus.loan.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.sql.Date;

@Entity
public class Receipts
{
    @Id
    private int receiptNo;
    private String receiptBasis;
    private String receiptType;
    private Date dateOfReceipt;
    private int receiptAmount;
    private String receiptPurpose;
    @ManyToOne
    private LoanApplication loanApplicationNumber;
    private Date createDate;
    private String createdBy;
    private Date modifiedDate;
    private String modifiedBy;
    private Date authorizedDate;
    private String authorizedBy;
}
