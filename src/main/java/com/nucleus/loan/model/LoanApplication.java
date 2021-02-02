package com.nucleus.loan.model;

import com.nucleus.loan.enumerator.Status;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

@Entity
public class LoanApplication
{
    @Id
    @Column(length = 10,name = "LoanApplicationNumber")
    private String loanApplicationNo;

    @Column(name = "LoanAmountRequested",nullable = false)
    private Double loanAmountRequested;
    @Column(name = "Tenure",length = 3,nullable = false)
    private int tenure;
    @Column(name = "Rate",length = 2,nullable = false)
    private Double rate;
    @Temporal(TemporalType.DATE)
    @Column(name = "AgreementDate",nullable = false)
    private Date agreementDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "InstallmentDueDate",nullable = false)
    private Date installmentDueDate;
    @Temporal(TemporalType.DATE)
    private Date createdDate;
    @Column(length = 30)
    private String createdBy;
    @Temporal(TemporalType.DATE)
    private Date modifiedDate;
    @Column(length = 30)
    private String modifiedBy;
    @Temporal(TemporalType.DATE)
    private Date authorizedDate;
    @Column(length = 30)
    private String authorizedBy;
    private String loanType;
    private Status disbursalStatus;

    @ManyToOne(cascade = CascadeType.ALL)
    private Customer customer;

    @ManyToOne(cascade = CascadeType.ALL)
    private Product product;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Advice> advice;

    @OneToMany(cascade = CascadeType.ALL)
    private List<RepaymentSchedule> repaymentSchedules;

    public String getLoanApplicationNo() {
        return loanApplicationNo;
    }

    public void setLoanApplicationNo(String loanApplicationNo) {
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

    public Date getAgreementDate() {
        return agreementDate;
    }

    public void setAgreementDate(Date agreementDate) {
        this.agreementDate = agreementDate;
    }

    public Date getInstallmentDueDate() {
        return installmentDueDate;
    }

    public void setInstallmentDueDate(Date installmentDueDate) {
        this.installmentDueDate = installmentDueDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getAuthorizedDate() {
        return authorizedDate;
    }

    public void setAuthorizedDate(Date authorizedDate) {
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

    public Status getDisbursalStatus() {
        return disbursalStatus;
    }

    public void setDisbursalStatus(Status disbursalStatus) {
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

    @Override
    public String toString() {
        return "LoanApplication{" +
                "loanApplicationNo=" + loanApplicationNo +
                ", loanAmountRequested=" + loanAmountRequested +
                ", tenure=" + tenure +
                ", rate=" + rate +
                ", agreementDate=" + agreementDate +
                ", installmentDueDate=" + installmentDueDate +
                ", createdDate=" + createdDate +
                ", createdBy='" + createdBy + '\'' +
                ", modifiedDate=" + modifiedDate +
                ", modifiedBy='" + modifiedBy + '\'' +
                ", authorizedDate=" + authorizedDate +
                ", authorizedBy='" + authorizedBy + '\'' +
                ", loanType='" + loanType + '\'' +
                ", disbursalStatus=" + disbursalStatus +
                ", customer=" + customer +
                ", product=" + product +
                ", advice=" + advice +
                ", repaymentSchedules=" + repaymentSchedules +
                '}';
    }
}
