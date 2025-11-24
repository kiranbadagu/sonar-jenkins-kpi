package org.example;


public class TestAccess {
    public int publicVar = 10;
    protected int protectedVar = 20;
    int varaible = 30;
    private int privateVar = 40;

    public void display() {
       // System.out.println(" Access classes are :");
        System.out.println("Public Variable is : " + publicVar );
        System.out.println("Protected Variable is : " + protectedVar);
        System.out.println(" Default Variable is : " + varaible);
        System.out.println(" Private Variable is: " + privateVar);
    }

}


