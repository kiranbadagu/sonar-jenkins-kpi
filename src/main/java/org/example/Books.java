package org.example;

public class Books {
    String Title;
    String Author;
    double Price;
    public Books(String Title, String Author, double Price){
        this.Title=Title;
        this.Author=Author;
        this.Price=Price;
    }
    public  void displayDetails() {
        System.out.println("Title: " + Title);
        System.out.println("Author: " + Author);
        System.out.println("Price: Rs. " + Price);
    }
}
