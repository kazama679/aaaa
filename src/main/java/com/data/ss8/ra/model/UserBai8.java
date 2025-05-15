package com.data.ss8.ra.model;

public class UserBai8 {
    private int id;
    private String username;
    private String password;
    private String email;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UserBai8(double balance, String email, int id, String password, String username) {
        this.balance = 10000;
        this.email = email;
        this.id = id;
        this.password = password;
        this.username = username;
    }

    public UserBai8() {
    }
}
