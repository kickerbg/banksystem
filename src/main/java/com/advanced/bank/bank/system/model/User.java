package com.advanced.bank.bank.system.model;

import com.advanced.bank.bank.system.model.enums.UserType;

import java.util.List;
import java.util.Set;

public class User {
    private Long id;
    private UserType userType;
    private Set<Object> accounts;
    private String firstName;
    private String lastName;
    private String egn;
    private String mobileNumber;
    private List<Object> addresses;
    private String email;
    private String password;

}
