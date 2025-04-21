package org.example;

public class Main {
    public static void main(String[] args) {
        Smartphone androidPhone = org.example.SmartphoneFactory.createSmartphone("Android", "Galaxy S21", 8, 128);
        Smartphone iphone = org.example.SmartphoneFactory.createSmartphone("iPhone", "iPhone 13", null, 256);

        System.out.println(androidPhone.getSpecs());
        System.out.println(iphone.getSpecs());
    }
}
