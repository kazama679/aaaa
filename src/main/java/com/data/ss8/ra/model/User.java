package com.data.ss8.ra.model;

public class User {
    private static int idAuto=0;
    private int id;
    private String name;
    private String email;
    private String phone;

    public User(String email, String name, String phone) {
        this.email = email;
        this.id = ++idAuto;
        this.name = name;
        this.phone = phone;
    }

    public User() {
        this.id = ++idAuto;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
