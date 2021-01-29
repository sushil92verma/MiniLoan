package com.nucleus.loan.model;

import java.util.Date;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Payment
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, length = 10)
    private int paymentId;
    @Column(nullable = false, length = 40)
    private String paymentBasis;
    @Column(nullable = false, length = 20)
    private String paidTo;
    @Column(nullable = false, length = 20)
    private String payeeName;
    @Column(nullable = false, length = 20)
    private String loanAccount;
    @Column(nullable = false)
    private Double paymentAmount;
    @Column(nullable = false, length = 20)
    private String loanStatus;
    @Column(nullable = false, length = 20)
    private String paymentMode;
    @Column(nullable = false)
    private Date paymentDate;
    @Column(length = 20)
    private String remarks;
    @Column(nullable = false)
    private int payoutBankAccountNumber;
    @Column(nullable = false, length = 30)
    private String paymentAccount;
    @Column(nullable = false, length = 30)
    private String paymentAccountCode;
    @OneToOne
    private LoanApplication loanApplication;

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentBasis() {
        return paymentBasis;
    }

    public void setPaymentBasis(String paymentBasis) {
        this.paymentBasis = paymentBasis;
    }

    public String getPaidTo() {
        return paidTo;
    }

    public void setPaidTo(String paidTo) {
        this.paidTo = paidTo;
    }

    public String getPayeeName() {
        return payeeName;
    }

    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName;
    }

    public String getLoanAccount() {
        return loanAccount;
    }

    public void setLoanAccount(String loanAccount) {
        this.loanAccount = loanAccount;
    }

    public Double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(String loanStatus) {
        this.loanStatus = loanStatus;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public int getPayoutBankAccountNumber() {
        return payoutBankAccountNumber;
    }

    public void setPayoutBankAccountNumber(int payoutBankAccountNumber) {
        this.payoutBankAccountNumber = payoutBankAccountNumber;
    }

    public String getPaymentAccount() {
        return paymentAccount;
    }

    public void setPaymentAccount(String paymentAccount) {
        this.paymentAccount = paymentAccount;
    }

    public String getPaymentAccountCode() {
        return paymentAccountCode;
    }

    public void setPaymentAccountCode(String paymentAccountCode) {
        this.paymentAccountCode = paymentAccountCode;
    }

    public LoanApplication getLoanApplication() {
        return loanApplication;
    }

    public void setLoanApplication(LoanApplication loanApplication) {
        this.loanApplication = loanApplication;
    }

    @Override
    public String toString() {
        return "PaymentCreation{" +
                "paymentId=" + paymentId +
                ", paymentBasis='" + paymentBasis + '\'' +
                ", paidTo='" + paidTo + '\'' +
                ", payeeName='" + payeeName + '\'' +
                ", loanAccount='" + loanAccount + '\'' +
                ", paymentAmount=" + paymentAmount +
                ", loanStatus='" + loanStatus + '\'' +
                ", paymentMode='" + paymentMode + '\'' +
                ", paymentDate=" + paymentDate +
                ", remarks='" + remarks + '\'' +
                ", payoutBankAccountNumber=" + payoutBankAccountNumber +
                ", paymentAccount='" + paymentAccount + '\'' +
                ", paymentAccountCode='" + paymentAccountCode + '\'' +
                ", loanApplication=" + loanApplication +
                '}';
    }
}
