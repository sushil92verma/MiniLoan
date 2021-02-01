package com.nucleus.loan.model;

import javax.persistence.*;
import java.util.Date;

@Table(name = "repayment_schedules")
@Entity
public class RepaymentSchedule
{
    @Id
    @Column(name = "installment_no")
    private String installmentNo;
    @Column(name = "opening_balance")
    private double openingBalance;
    @Column(name = "interest_component")
    private double interestComponent;
    @Column(name = "principal_component")
    private double principalComponent;
    @Column(name = "emi")
    private double emi;
    @Column(name = "emi_status")
    private String emiStatus;
    @Column(name = "closing_balance")
    private double closingBalance;
    @Column(name = "due_date")
    private Date dueDate;
    @Column(name = "bill_flag")
    private char billFlag;
    @JoinColumn(name = "loan_application_number")
    @ManyToOne(cascade = CascadeType.ALL)
    private LoanApplication loanApplication;

    public String getInstallmentNo() {
        return installmentNo;
    }

    public void setInstallmentNo(String installmentNo) {
        this.installmentNo = installmentNo;
    }

    public double getOpeningBalance() {
        return openingBalance;
    }

    public void setOpeningBalance(double openingBalance) {
        this.openingBalance = openingBalance;
    }

    public double getInterestComponent() {
        return interestComponent;
    }

    public void setInterestComponent(double interestComponent) {
        this.interestComponent = interestComponent;
    }

    public double getPrincipalComponent() {
        return principalComponent;
    }

    public void setPrincipalComponent(double principalComponent) {
        this.principalComponent = principalComponent;
    }

    public double getEmi() {
        return emi;
    }

    public void setEmi(double emi) {
        this.emi = emi;
    }

    public String getEmiStatus() {
        return emiStatus;
    }

    public void setEmiStatus(String emiStatus) {
        this.emiStatus = emiStatus;
    }

    public double getClosingBalance() {
        return closingBalance;
    }

    public void setClosingBalance(double closingBalance) {
        this.closingBalance = closingBalance;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public char getBillFlag() {
        return billFlag;
    }

    public void setBillFlag(char billFlag) {
        this.billFlag = billFlag;
    }

    public LoanApplication getLoanApplication() {
        return loanApplication;
    }

    public void setLoanApplication(LoanApplication loanApplication) {
        this.loanApplication = loanApplication;
    }

    @Override
    public String toString() {
        return "RepaymentSchedule{" +
                "installmentNo='" + installmentNo + '\'' +
                ", openingBalance=" + openingBalance +
                ", interestComponent=" + interestComponent +
                ", principalComponent=" + principalComponent +
                ", emi=" + emi +
                ", emiStatus='" + emiStatus + '\'' +
                ", closingBalance=" + closingBalance +
                ", dueDate=" + dueDate +
                ", billFlag=" + billFlag +
                ", loanApplication=" + loanApplication +
                '}';
    }
}