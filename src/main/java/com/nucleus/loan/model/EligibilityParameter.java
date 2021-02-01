package com.nucleus.loan.model;

import javax.persistence.*;

@Entity
@Table(name = "EligibilityParameter")
public class EligibilityParameter
{
    @Id
    @Column(name = "parameterCode",length=10)
    private String parameterCode;
    @Column(name = "parameterName",length=20)
    private String parameterName;
    @Column(name = "parameterDescription",length=200)
    private String parameterDescription;
    @ManyToOne(mappedBy = "eligibilityParameter")
    private EligibilityPolicy eligibilityPolicies;

}
