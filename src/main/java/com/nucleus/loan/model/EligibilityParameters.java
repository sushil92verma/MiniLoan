package com.nucleus.loan.model;

import java.sql.Date;

public class EligibilityParameters {
    private String ParameterCode;
    private String ParameterName;
    private Integer MinValue;
    private Integer MaxValue;
    private String parameterDescription;
    private Date createDate;
    private String createdBy;
    private Date modifiedDate;
    private String modifiedBy;
    private Date authorizedDate;
    private String authorizedBy;

    public String getParameterCode() {
        return ParameterCode;
    }

    public void setParameterCode(String parameterCode) {
        ParameterCode = parameterCode;
    }

    public String getParameterName() {
        return ParameterName;
    }

    public void setParameterName(String parameterName) {
        ParameterName = parameterName;
    }

    public Integer getMinValue() {
        return MinValue;
    }

    public void setMinValue(Integer minValue) {
        MinValue = minValue;
    }

    public Integer getMaxValue() {
        return MaxValue;
    }

    public void setMaxValue(Integer maxValue) {
        MaxValue = maxValue;
    }

    public String getParameterDescription() {
        return parameterDescription;
    }

    public void setParameterDescription(String parameterDescription) {
        this.parameterDescription = parameterDescription;
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
}
