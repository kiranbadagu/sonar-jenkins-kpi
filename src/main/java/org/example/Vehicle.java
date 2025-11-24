package org.example;

public class Vehicle {
    String Model;
    int Topspeed;
    public void Details() {
        System.out.println("Brand: " + Model);
        System.out.println("Speed: " + Topspeed + " km/h");
    }
}
class Car extends Vehicle {
    int numberOfDoors;

    public void Music() {
        System.out.println("Music  system is available in car");
    }
    public void displayCarDetails() {
        Details();
        System.out.println("Number of doors: " + numberOfDoors);
    }
}
class Bike extends Vehicle{
    Boolean Type;
    public void Engine(){
        System.out.println("Bike has noise free engine ");
    }
    public void displayBikeDetails(){
        Details();
        System.out.println("Bike has Autostart only :  "+ (Type ? "Yes" : "No"));
    }
}
