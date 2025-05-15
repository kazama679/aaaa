package com.data.ss8.ra.model;

public class Seeds {
    private int id;
    private String seedsName;
    private double price;
    private String imageUrl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSeedsName() {
        return seedsName;
    }

    public void setSeedsName(String seedsName) {
        this.seedsName = seedsName;
    }

    public Seeds(int id, String imageUrl, double price, String seedsName) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.price = price;
        this.seedsName = seedsName;
    }

    public Seeds() {
    }
}
