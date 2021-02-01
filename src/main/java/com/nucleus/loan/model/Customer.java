package com.nucleus.loan.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;


@Entity
@Table(name = "Customer")
public class Customer
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customerCode",length = 20)
    private int customerCode;
    @Column(length = 30,nullable = false)
    private String occupationType;
    private String gender;
    @Column(length = 30,nullable = false)
    private String nationality;
    @Column(length = 30,nullable = false)
    private String firstName;
    @Column(length = 30,nullable = false)
    private String lastName;
    @Column(length = 30,nullable = false)
    private String fullName;
    @Column(nullable = false)
    private Date dateOfBirth;
    @Column(length = 2)
    private int workExperience;
    @Column(length = 30)
    private String organizationName;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "customer")
    private List<Address> address;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "customer")
    private List<LoanApplication> loanApplication;


    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public int getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }

    public String getOccupationType() {
        return occupationType;
    }

    public void setOccupationType(String occupationType) {
        this.occupationType = occupationType;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "occupationType='" + occupationType + '\'' +
                ", gender='" + gender + '\'' +
                ", nationality='" + nationality + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", workExperience=" + workExperience +
                ", organizationName='" + organizationName + '\'' +
                '}';
    }
}
