package com.nucleus.loan.repaymentschedule.model;

import javax.persistence.*;
import java.util.Date;

@Table(name = "loan_applications")
@Entity
public class LoanApplication
{
    @Id
    @Column(name = "loan_application_number")
    private String loanApplicationNumber;
    @Column(name = "loan_amount_requested")
    private double loanAmountRequested;
    @Column(name = "tenure")
    private int tenure;
    @Column(name = "rate")
    private double rate;
    @Column(name = "installment_due_date")
    private Date installmentDueDate;

    public String getLoanApplicationNumber() {
        return loanApplicationNumber;
    }

    public void setLoanApplicationNumber(String loanApplicationNumber) {
        this.loanApplicationNumber = loanApplicationNumber;
    }

    public double getLoanAmountRequested() {
        return loanAmountRequested;
    }

    public void setLoanAmountRequested(double loanAmountRequested) {
        this.loanAmountRequested = loanAmountRequested;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public Date getInstallmentDueDate() {
        return installmentDueDate;
    }

    public void setInstallmentDueDate(Date installmentDueDate) {
        this.installmentDueDate = installmentDueDate;
    }

    @Override
    public String toString() {
        return "LoanApplication{" +
                "loanApplicationNumber='" + loanApplicationNumber + '\'' +
                ", loanAmountRequested=" + loanAmountRequested +
                ", tenure=" + tenure +
                ", rate=" + rate +
                ", installmentDueDate=" + installmentDueDate +
                '}';
    }
}
