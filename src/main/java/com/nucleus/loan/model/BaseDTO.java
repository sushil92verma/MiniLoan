package com.nucleus.loan.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public class BaseDTO implements Serializable {
	@Temporal(TemporalType.DATE)
    @Column(name = "CREATE_DATE")
	protected Date createDate;
	@Column(name = "CREATED_BY", length = 30)
	protected String createdBy;
	@Temporal(TemporalType.DATE)
	@Column(name = "MODIFIED_DATE")
	protected Date modifiedDate;
	@Column(name = "MODIFIED_BY", length = 30)
	protected String modifiedBy;
	@Temporal(TemporalType.DATE)
	@Column(name = "AUTHORIZED_DATE")
	protected Date authorizedDate;
	@Column(name = "AUTHORIZED_BY", length = 30)
	protected String authorizedBy;
	
	public enum Status { PENDING, APPROVED, REJECTED, ACTIVE, CLOSED }
	@Column(name = "status", length = 10)
	protected String status;
	
	protected Status st;

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

	public Status getSt() {
		return st;
	}

	public void setSt(Status st) {
		this.st = st;
	}
	
	

}
