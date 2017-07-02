/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author james chalmers F6418079
 *
 */
@Entity
@Table(name = "customer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Customer.findAll", query = "SELECT c FROM Customer c")
    , @NamedQuery(name = "Customer.findByCustomerId", query = "SELECT c FROM Customer c WHERE c.customerId = :customerId")
    , @NamedQuery(name = "Customer.findByTitle", query = "SELECT c FROM Customer c WHERE c.title = :title")
    , @NamedQuery(name = "Customer.findByFirstName", query = "SELECT c FROM Customer c WHERE c.firstName = :firstName")
    , @NamedQuery(name = "Customer.findBySurname", query = "SELECT c FROM Customer c WHERE c.surname = :surname")
    , @NamedQuery(name = "Customer.findByMobileNo", query = "SELECT c FROM Customer c WHERE c.mobileNo = :mobileNo")
    , @NamedQuery(name = "Customer.findByHomePhoneNumber", query = "SELECT c FROM Customer c WHERE c.homePhoneNumber = :homePhoneNumber")
    , @NamedQuery(name = "Customer.findByEmailAddress", query = "SELECT c FROM Customer c WHERE c.emailAddress = :emailAddress")
    , @NamedQuery(name = "Customer.findByLoginName", query = "SELECT c FROM Customer c WHERE c.loginName = :loginName")
    , @NamedQuery(name = "Customer.findByLoginPassword", query = "SELECT c FROM Customer c WHERE c.loginPassword = :loginPassword")
    , @NamedQuery(name = "Customer.findByDateOfBirth", query = "SELECT c FROM Customer c WHERE c.dateOfBirth = :dateOfBirth")})
public class Customer extends Person implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CustomerId")
    private Integer customerId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "LoginName")
    private String loginName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "LoginPassword")
    private String loginPassword;

    public Customer() {
    }

    public Customer(Integer customerId) {
        this.customerId = customerId;
    }

    public Customer(Integer customerId, String title, String firstName, String surname, String mobileNo, String homePhoneNumber, String emailAddress, String loginName, String loginPassword, Date dateOfBirth) {
        this.customerId = customerId;
        this.title = title;
        this.firstName = firstName;
        this.surname = surname;
        this.mobileNo = mobileNo;
        this.homePhoneNumber = homePhoneNumber;
        this.emailAddress = emailAddress;
        this.loginName = loginName;
        this.loginPassword = loginPassword;
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public void setHomePhoneNumber(String homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customerId != null ? customerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.customerId == null && other.customerId != null) || (this.customerId != null && !this.customerId.equals(other.customerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Customer[ customerId=" + customerId + " ]";
    }

}
