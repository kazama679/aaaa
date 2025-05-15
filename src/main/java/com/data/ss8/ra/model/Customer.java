package com.data.ss8.ra.model;

public class Customer {
    private int id;
    private String fullName;
    private String email;
    private String gender;
    private String customerType;

    public Customer(String customerType, String email, String fullName, String gender, int id) {
        this.customerType = customerType;
        this.email = email;
        this.fullName = fullName;
        this.gender = gender;
        this.id = id;
    }

    public Customer() {
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
