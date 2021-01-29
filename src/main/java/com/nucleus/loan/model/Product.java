package com.nucleus.model;

import javax.persistence.*;
import java.sql.Date;

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity(name = "Product")
@Table(name = "Product")
public class Product {

    @Id
    private String productCode;
    private String productName;
    private String productDescription;
    private String productType;
    @ManyToOne(cascade = CascadeType.ALL)
    private RepaymentPolicy repaymentPolicyCode;
    @ManyToOne(cascade = CascadeType.ALL)
    private EligibilityPolicy eligibilityPolicyCode;
    @ManyToOne(cascade = CascadeType.ALL)
    private ChargePolicy chargePolicyCode;
    private double maxExposureAmount;
    public enum loanStatus{
        saved, requestApproval, approved, rejected;
    }
    private loanStatus status;
    private Date createDate;
    private String createdBy;
    private Date modifiedDate;
    private String modifiedBy;
    private Date authorizedDate;
    private String authorizedBy;

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

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String product_Code) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public RepaymentPolicy getRepaymentPolicyCode() {
        return repaymentPolicyCode;
    }

    public void setRepaymentPolicyCode(RepaymentPolicy repaymentPolicyCode) {
        this.repaymentPolicyCode = repaymentPolicyCode;
    }

    public EligibilityPolicy getEligibilityPolicyMappingCode() {
        return eligibilityPolicyCode;
    }

    public void setEligibilityPolicyMappingCode(EligibilityPolicy eligibilityPolicyCode) {
        this.eligibilityPolicyCode = eligibilityPolicyCode;
    }

    public ChargePolicy getChargePolicyMappingCode() {
        return chargePolicyCode;
    }

    public void setChargePolicyMappingCode(ChargePolicy chargePolicyCode) {
        this.chargePolicyCode = chargePolicyCode;
    }

    public double getMaxExposureAmount() {
        return maxExposureAmount;
    }

    public void setMaxExposureAmount(double maxExposureAmount) {
        this.maxExposureAmount = maxExposureAmount;
    }

    public loanStatus getStatus() {
        return status;
    }

    public void setStatus(loanStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_Code='" + productCode + '\'' +
                ", product_Name='" + productName + '\'' +
                ", product_Description='" + productDescription + '\'' +
                ", product_Type='" + productType + '\'' +
                ", repaymentPolicyCode=" + repaymentPolicyCode +
                ", eligibilityPolicyCode=" + eligibilityPolicyCode +
                ", chargePolicyMappingCode=" + chargePolicyCode +
                ", max_Exposure_Amount=" + maxExposureAmount +
                ", status=" + status +
                '}';
    }
}
