package com.example.customers.models;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tblcustomers")
public class Customers {
    @Column(name = "document")
    @Id
    private long document;

    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "cell_phone")
    private String cellPhone;
    @Column(name = "email")
    private String email;
    @Column(name = "municipality")
    private String municipality;
    @Column(name = "address")
    private String address;
    @Column(name = "contact_name")
    private String contactName;
    @Column(name = "cell_phone_contact")
    private String cellPhoneContact;

    @CreationTimestamp
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created_at;

    @UpdateTimestamp
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updated_at;

    public Customers(long document, String name, String lastName, String cellPhone, String email, String municipality, String address, String contactName, String cellPhoneContact, Date created_at, Date updated_at) {
        this.document = document;
        this.name = name;
        this.lastName = lastName;
        this.cellPhone = cellPhone;
        this.email = email;
        this.municipality = municipality;
        this.address = address;
        this.contactName = contactName;
        this.cellPhoneContact = cellPhoneContact;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public Customers() {

    }

    public long getDocument() {
        return document;
    }

    public void setDocument(long document) {
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getCellPhoneContact() {
        return cellPhoneContact;
    }

    public void setCellPhoneContact(String cellPhoneContact) {
        this.cellPhoneContact = cellPhoneContact;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }
}
