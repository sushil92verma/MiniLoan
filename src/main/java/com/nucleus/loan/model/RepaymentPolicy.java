package com.nucleus.loan.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import com.nucleus.loan.model.BaseDTO;

@Entity
@Table(name = "REPAYMENT_POLICY")
public class RepaymentPolicy extends BaseDTO{
	@Id
	@Size(max=10,min=3,message="Enter Correct!!!")
	@Column(name = "POLICY_CODE", length = 10, unique = true, nullable = false)
	private String policyCode;
	@Column(name = "POLICY_NAME", length = 30, unique = true, nullable = false)
	private String policyName;
	@Column(name = "POLICY_DESCRIPTION", length = 200)
	private String policyDescription;
	@Temporal(TemporalType.DATE)
	@Column(name = "INSTALMENT_DUE_DATE", nullable = false)
	private Date instalmentDueDate;
	@Column(name = "REPAYMENT_FREQUENCY", length = 20, nullable = false)
	private String repaymentFrequency;
	@Column(name = "MIN_TENURE", length = 3)
	private int minTenure;
	@Column(name = "MAX_TENURE", length = 3)
	private int maxTenure;
	@Column(name = "DEFAULT_TENURE", length = 3)
	private int defaultTenure;
	@Column(name = "INTEREST_RATE_TYPE", length = 20)
	private String interestRateType;
	@Column(name = "DEFAULT_RATE", length = 2)
	private int defaultRate;
	@OneToMany
        private List<Product> product;
	public String getPolicyCode() {
		return policyCode;
	}
	public void setPolicyCode(String policyCode) {
		this.policyCode = policyCode;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public String getPolicyDescription() {
		return policyDescription;
	}
	public void setPolicyDescription(String policyDescription) {
		this.policyDescription = policyDescription;
	}
	public Date getInstalmentDueDate() {
		return instalmentDueDate;
	}
	public void setInstalmentDueDate(Date instalmentDueDate) {
		this.instalmentDueDate = instalmentDueDate;
	}
	public String getRepaymentFrequency() {
		return repaymentFrequency;
	}
	public void setRepaymentFrequency(String repaymentFrequency) {
		this.repaymentFrequency = repaymentFrequency;
	}
	public int getMinTenure() {
		return minTenure;
	}
	public void setMinTenure(int minTenure) {
		this.minTenure = minTenure;
	}
	public int getMaxTenure() {
		return maxTenure;
	}
	public void setMaxTenure(int maxTenure) {
		this.maxTenure = maxTenure;
	}
	public int getDefaultTenure() {
		return defaultTenure;
	}
	public void setDefaultTenure(int defaultTenure) {
		this.defaultTenure = defaultTenure;
	}
	public String getInterestRateType() {
		return interestRateType;
	}
	public void setInterestRateType(String interestRateType) {
		this.interestRateType = interestRateType;
	}
	public int getDefaultRate() {
		return defaultRate;
	}
	public void setDefaultRate(int defaultRate) {
		this.defaultRate = defaultRate;
	}
	
	

}
