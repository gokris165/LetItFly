package com.project.LetItFly.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @Column(name = "card_number")
    private String cardNumber;

    @Column(name = "expiration")
    private String expiration;

    @Column(name = "cvv")
    private int cvv;

    @Column(name = "type")
    private String type;

    @ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH })
    @JoinColumn(name = "user_id")
    private User userId;

    @Column(name = "name")
    private String name;

    @Column(name = "billing_address")
    private String billingAddress;

    @Column(name = "balance")
    private double balance;

    public Payment() {
    }

    public Payment(String expiration, int cvv, String type, User userId, String name, String billingAddress,
            double balance) {
        this.expiration = expiration;
        this.cvv = cvv;
        this.type = type;
        this.userId = userId;
        this.name = name;
        this.billingAddress = billingAddress;
        this.balance = balance;
    }

    public String getExpiration() {
        return this.expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public int getCvv() {
        return this.cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public User getUserId() {
        return this.userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBillingAddress() {
        return this.billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "{" +
                " expiration='" + getExpiration() + "'" +
                ", cvv='" + getCvv() + "'" +
                ", type='" + getType() + "'" +
                ", userId='" + getUserId() + "'" +
                ", name='" + getName() + "'" +
                ", billingAddress='" + getBillingAddress() + "'" +
                ", balance='" + getBalance() + "'" +
                "}";
    }
}