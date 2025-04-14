package org.example;

public class Main {
    public static void main(String[] args) {
        Smartphone androidPhone = SmartphoneFactory.createSmartphone("Android", "Galaxy S21", 8, 128);
        Smartphone iphone = SmartphoneFactory.createSmartphone("iPhone", "iPhone 13", null, 256);

        System.out.println(androidPhone.getSpecs());
        System.out.println(iphone.getSpecs());
    }

    public interface Smartphone {
        String getSpecs();
    }

    public static class AndroidSmartphone implements Smartphone {
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

    public static class IPhone implements Smartphone {
        private String model;
        private int storage;

        public IPhone(String model, int storage) {
            this.model = model;
            this.storage = storage;
        }

        @Override
        public String getSpecs() {
            return "iPhone: " + model + ", Storage: " + storage + "GB";
        }
    }

    public static class SmartphoneFactory {
        public static Smartphone createSmartphone(String brand, String model, Integer ram, Integer storage) {
            if (brand.equalsIgnoreCase("android")) {
                return new AndroidSmartphone(model, ram != null ? ram : 0, storage); // Предполагаем 0 для RAM если null
            } else if (brand.equalsIgnoreCase("iphone")) {
                return new IPhone(model, storage);
            } else {
                throw new IllegalArgumentException("Unknown smartphone brand");
            }
        }
    }
}
