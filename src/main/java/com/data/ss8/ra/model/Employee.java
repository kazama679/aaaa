package com.data.ss8.ra.model;

public class Employee {
    private static int idAuto=0;
    private int id;
    private String name;
    private String email;
    private String position;

    public Employee() {
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Employee(String email, String name, String position) {
        this.email = email;
        this.id = ++idAuto;
        this.name = name;
        this.position = position;
    }
}
