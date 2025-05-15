package com.data.ss8.ra.model;

public class Product {
    private int id;
    private String name;
    private double price;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(String description, int id, String name, double price) {
        this.description = description;
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product() {
    }
}
