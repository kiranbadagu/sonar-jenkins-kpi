package org.training;

public class thisEx {
    String name;
    int rollNumber;

    public thisEx(String name, int rollNumber) {

        this.name = name;
        this.rollNumber = rollNumber;
        int temp = 100;

        System.out.println("Inside constructor:");
        System.out.println("Local variable temp = " + temp);
        System.out.println("Instance variable name = " + this.name);
        System.out.println("Instance  variable rollNumber = " + this.rollNumber);
    }
}
