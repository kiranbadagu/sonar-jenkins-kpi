package org.example;

public class Shape {
    public void draw(){
        System.out.println("Drawing a shape...");
    }
}
class Circle extends Shape{
    public void draw() {
        System.out.println("Draw  a Circle..");
    }
}
class Rectangle extends Shape{
    public void draw() {
        System.out.println("Draw a Rectangle..");
    }
}
class Triangle extends Shape{
    public void draw(){
        System.out.println("Draw a Triangle..");
    }
}
