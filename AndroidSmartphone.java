package org.example;

public class AndroidSmartphone implements Smartphone {
    private String model;
    private int ram;
    private int storage;

    public AndroidSmartphone(String model, int ram, int storage) {
        this.model = model;
        this.ram = ram;
        this.storage = storage;
    }

    @Override
    public String getSpecs() {
        return "Android Smartphone: " + model + ", RAM: " + ram + "GB, Storage: " + storage + "GB";
    }
}
