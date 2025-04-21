package org.example;

public class SmartphoneFactory {
    public static Smartphone createSmartphone(String brand, String model, Integer ram, Integer storage) {
        if (brand.equalsIgnoreCase("android")) {
            return new AndroidSmartphone(model, ram != null ? ram : 0, storage); // Предполагаем 0 для RAM если null
        } else if (brand.equalsIgnoreCase("iphone")) {
            return new org.example.Iphone(model, storage);
        } else {
            throw new IllegalArgumentException("Unknown smartphone brand");
        }
    }
}
