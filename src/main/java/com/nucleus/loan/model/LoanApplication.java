package com.nucleus.loan.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class LoanApplication
{
    @Id
    @Column(length = 10,name = "LoanApplicationNumber")
    private int loanApplicationNo;

    @Column(name = "LoanAmountRequested",nullable = false)
    private Double loanAmountRequested;
    @Column(name = "Tenure",length = 3,nullable = false)
    private int tenure;
    @Column(name = "Rate",length = 2,nullable = false)
    private Double rate;
    @Column(name = "AgreementDate",nullable = false)
    private String agreementDate;
    @Column(name = "InstallmentDueDate",nullable = false)
    private String installmentDueDate;
    private String createdDate;
    @Column(length = 30)
    private String createdBy;
    private String modifiedDate;
    @Column(length = 30)
    private String modifiedBy;
    private String authorizedDate;
    @Column(length = 30)
    private String authorizedBy;
    private String loanType;
    private String disbursalStatus;

    @ManyToOne(cascade = CascadeType.ALL)
    private Customer customer;

    @ManyToOne(cascade = CascadeType.ALL)
    private Product product;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Advice> advice;

    @OneToMany(cascade = CascadeType.ALL)
    private List<RepaymentSchedule> repaymentSchedules;

    public List<Advice> getAdvice() {
        return advice;
    }

    public void setAdvice(List<Advice> advice) {
        this.advice = advice;
    }

    public List<RepaymentSchedule> getRepaymentSchedules() {
        return repaymentSchedules;
    }

    public void setRepaymentSchedules(List<RepaymentSchedule> repaymentSchedules) {
        this.repaymentSchedules = repaymentSchedules;
    }

    public int getLoanApplicationNo() {
        return loanApplicationNo;
    }

    public void setLoanApplicationNo(int loanApplicationNo) {
        this.loanApplicationNo = loanApplicationNo;
    }

    public Double getLoanAmountRequested() {
        return loanAmountRequested;
    }

    public void setLoanAmountRequested(Double loanAmountRequested) {
        this.loanAmountRequested = loanAmountRequested;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public String getAgreementDate() {
        return agreementDate;
    }

    public void setAgreementDate(String agreementDate) {
        this.agreementDate = agreementDate;
    }

    public String getInstallmentDueDate() {
        return installmentDueDate;
    }

    public void setInstallmentDueDate(String installmentDueDate) {
        this.installmentDueDate = installmentDueDate;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getAuthorizedDate() {
        return authorizedDate;
    }

    public void setAuthorizedDate(String authorizedDate) {
        this.authorizedDate = authorizedDate;
    }

    public String getAuthorizedBy() {
        return authorizedBy;
    }

    public void setAuthorizedBy(String authorizedBy) {
        this.authorizedBy = authorizedBy;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public String getDisbursalStatus() {
        return disbursalStatus;
    }

    public void setDisbursalStatus(String disbursalStatus) {
        this.disbursalStatus = disbursalStatus;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "LoanApplication{" +
                "loanApplicationNo=" + loanApplicationNo +
                ", loanAmountRequested=" + loanAmountRequested +
                ", tenure=" + tenure +
                ", rate=" + rate +
                ", agreementDate='" + agreementDate + '\'' +
                ", installmentDueDate='" + installmentDueDate + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", modifiedDate='" + modifiedDate + '\'' +
                ", modifiedBy='" + modifiedBy + '\'' +
                ", authorizedDate='" + authorizedDate + '\'' +
                ", authorizedBy='" + authorizedBy + '\'' +
                ", loanType='" + loanType + '\'' +
                ", disbursalStatus='" + disbursalStatus + '\'' +
                ", customer=" + customer +
                ", product='" + product + '\'' +
                '}';
    }
}
