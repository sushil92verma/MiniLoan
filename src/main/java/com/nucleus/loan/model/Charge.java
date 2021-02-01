package com.nucleus.loan.model;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import java.sql.Date;

@Entity
public class Charge
{
    @Id
    @Column(length = 10)
    @NotEmpty(message = "This field is Required!!")
    private String chargeCode;

    @Column(unique = true,length = 30)
    @NotEmpty(message = "This field is Required!!")
    private String chargeCodeName;



    @Column(length = 200)
    private String chargePolicyDesc;


    @NotEmpty(message = "This field is Required!!")
    @Column(length = 40)
    private String transactionEvent;


    @NotEmpty(message = "This field is Required!!")
    @Column(length = 20)
    private String chargePaymentType;


    @NotEmpty(message = "This field is Required!!")
    @Column(length = 20)
    private String chargeType;


    @NotNull(message = "This field is Required!!")
    private int chargeAmount;


    @NotNull(message = "This field is Required!!")
    private int chargeRate;




    @DateTimeFormat(pattern="dd/MM/yyyy")
    // @NotNull(message = "Please provide a date.")
    private Date createDate;


    @Column(length = 30)
    private String createdBy;

    @DateTimeFormat(pattern="dd/MM/yyyy")
    // @NotNull(message = "Please provide a date.")
    private Date modifiedDate;


    @Column(length = 30)
    private String modifiedBy;

    @DateTimeFormat(pattern="dd/MM/yyyy")
    // @NotNull(message = "Please provide a date.")
    private Date authorizedDate;


    @Column(length = 30)
    private String authorizedBy;

    @Column(name = "STATUS")
    private String status;


    @OneToOne
    private  ChargePolicy chargePolicy;


//    public enum chargeStatus
//    {
//        pending, requestApproval, approved, rejected;
//    }

//        private String status;
//
//        @Override
//        public String toString() {
//            return "status{" +
//                    "status='" + status + '\'' +
//                    '}';
//        }
//
//        public String getStatus() {
//            return status;
//        }
//
//        public void setStatus(String status) {
//            this.status = status;
//        }
//    }

    public enum ChargePaymentType {
        RECEIVABLE,PAYABLE, BOTH
    }
    public enum ChargeType {
        AMOUNTBASED,RATEBASED
    }

    @Override
    public String toString() {
        return "Charges{" +
                "chargeCode='" + chargeCode + '\'' +
                ", chargeCodeName='" + chargeCodeName + '\'' +
                ", chargePolicyDesc='" + chargePolicyDesc + '\'' +
                ", transactionEvent='" + transactionEvent + '\'' +
                ", chargePaymentType='" + chargePaymentType + '\'' +
                ", chargeType='" + chargeType + '\'' +
                ", chargeAmount=" + chargeAmount +
                ", chargeRate=" + chargeRate +
                ", createDate=" + createDate +
                ", createdBy='" + createdBy + '\'' +
                ", modifiedDate=" + modifiedDate +
                ", modifiedBy='" + modifiedBy + '\'' +
                ", authorizedDate=" + authorizedDate +
                ", authorizedBy='" + authorizedBy + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public String getChargeCode() {
        return chargeCode;
    }

    public void setChargeCode(String chargeCode) {
        this.chargeCode = chargeCode;
    }

    public String getChargeCodeName() {
        return chargeCodeName;
    }

    public void setChargeCodeName(String chargeCodeName) {
        this.chargeCodeName = chargeCodeName;
    }

    public String getChargePolicyDesc() {
        return chargePolicyDesc;
    }

    public void setChargePolicyDesc(String chargePolicyDesc) {
        this.chargePolicyDesc = chargePolicyDesc;
    }

    public String getTransactionEvent() {
        return transactionEvent;
    }

    public void setTransactionEvent(String transactionEvent) {
        this.transactionEvent = transactionEvent;
    }

    public String getChargePaymentType() {
        return chargePaymentType;
    }

    public void setChargePaymentType(String chargePaymentType) {
        this.chargePaymentType = chargePaymentType;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public int getChargeAmount() {
        return chargeAmount;
    }

    public void setChargeAmount(int chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    public int getChargeRate() {
        return chargeRate;
    }

    public void setChargeRate(int chargeRate) {
        this.chargeRate = chargeRate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
