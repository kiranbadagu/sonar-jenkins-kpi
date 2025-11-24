package org.example;

public class Counter {
    static int count =0;

    public Counter(){
        count++;
        System.out.println("Total Created : "+count);
    }
    public static void display(){
        System.out.println("Total  counters created are : "+count);
    }

}
