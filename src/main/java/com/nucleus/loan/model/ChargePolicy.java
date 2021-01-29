package com.nucleus.loan.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Date;
@Entity(name = "ChargePolicy")
@Table(name = "ChargePolicy")
public class ChargePolicy {

    @Id
    private String chargePolicyCode;
    private String chargePolicyName;
    private String chargePolicyDescription;

    private Date createDate;
    private String createdBy;
    private  Date modifiedDate;
    private String modifiedBy;
    private Date authorizedDate;
    private String authorizedBy;
    @OneToOne
    private Charge charge;
    @OneToOne
    private  Product product;
}
