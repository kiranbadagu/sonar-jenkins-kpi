package org.example;

public class Students {
    double s1;
    double s2;
    double s3;

    public Students(double sub1, double sub2, double sub3) {
        this.s1 = sub1;
        this.s2 = sub2;
        this.s3 = sub3;
    }

    public double calculateAverage() {
        double total = s1 + s2 + s3;
        return total / 3.0;
    }

    public void display() {
        System.out.println(" Marks of three subjects:");
        System.out.println("Subject 1: " + s1);
        System.out.println("Subject 2: " + s2);
        System.out.println("Subject 3: " + s3);
        System.out.println("Average marks: " + calculateAverage());
    }
}
