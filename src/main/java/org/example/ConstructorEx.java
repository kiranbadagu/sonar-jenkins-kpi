package org.example;

public class ConstructorEx {
    String brand;
    double price;
    public ConstructorEx(String brand, double price){
        this.brand=brand;
        this.price=price;
    }
    public  void display(){
        System.out.println("Brand name : " +brand);
        System.out.println("price  : " +price);
    }
}

