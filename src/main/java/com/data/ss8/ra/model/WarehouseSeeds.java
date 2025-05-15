package com.data.ss8.ra.model;

public class WarehouseSeeds {
    private int id;
    private int quantity;
    private Seeds seeds;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Seeds getSeeds() {
        return seeds;
    }

    public void setSeeds(Seeds seeds) {
        this.seeds = seeds;
    }

    public WarehouseSeeds() {
    }

    public WarehouseSeeds(int id, int quantity, Seeds seeds) {
        this.id = id;
        this.quantity = quantity;
        this.seeds = seeds;
    }
}
