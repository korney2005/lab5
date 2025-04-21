package org.example;

public class Iphone implements Smartphone {
    private String model;
    private int storage;

    public Iphone(String model, int storage) {
        this.model = model;
        this.storage = storage;
    }

    @Override
    public String getSpecs() {
        return "iPhone: " + model + ", Storage: " + storage + "GB";
    }
}
