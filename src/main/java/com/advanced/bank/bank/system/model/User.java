package com.advanced.bank.bank.system.model;

import com.advanced.bank.bank.system.model.enums.UserType;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User {
    private Long id;
    private UserType userType;
    private Set<Account> accounts = new HashSet<>();
    private String firstName;
    private String lastName;
    private String egn;
    private String mobileNumber;
    private Set<Address> addresses = new HashSet<>();
    private String email;
    private String password;
    private Set<UserSubscription> userSubscriptions = new HashSet<>();

    public Long getId() {
        return id;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public Set<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
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

    public String getEgn() {
        return egn;
    }

    public void setEgn(String egn) {
        this.egn = egn;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
    }

    public Set<UserSubscription> getUserSubscriptions() {
        return userSubscriptions;
    }

    public void setUserSubscriptions(Set<UserSubscription> userSubscriptions) {
        this.userSubscriptions = userSubscriptions;
    }
}
