
package com.nucleus.loan.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "EligibilityPolicy")
@Table(name = "EligibilityPolicy")
public class EligibilityPolicy {
    @Id
    @Column(name = "policyCode",length=10)
    private String policyCode;
    private String policyName;
    private String policyDescription;
    private Date createDate;
    private String createdBy;
    private Date modifiedDate;
    private String modifiedBy;
    private Date authorizedDate;
    private String authorizedBy;
    private PolicyStatus policyStatus;

    @OneToMany
    private List<EligibilityParameter> eligibilityParameter;
    @OneToMany
    private List<Product> product;

}


