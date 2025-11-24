package org.example;

public class MobileEx {

    String brand;
    double price;
    String model;
    public MobileEx() {
        brand = "Unknown";
        model = "Not specified";
        price = 0.0;
    }
    public MobileEx(String brand, double price) {
        this.brand = brand;
        this.price = price;
        this.model = "Not  specified";
    }
    public MobileEx(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
        System.out.println("-----------------------------");
    }
}
