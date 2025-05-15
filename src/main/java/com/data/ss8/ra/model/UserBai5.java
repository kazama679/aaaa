package com.data.ss8.ra.model;

public class UserBai5 {
    private String name;
    private int age;
    private String birthday;
    private String email;
    private String phone;

    public UserBai5() {
    }

    public UserBai5(String name, int age, String birthday, String email, String phone) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
