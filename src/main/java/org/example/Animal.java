package org.example;

public abstract class  Animal {

    public abstract void makesound();

}
class Dog extends Animal{
    public void makesound() {
        System.out.println("Dog barks!!!");
    }
}
class Cat extends Animal{
    public void makesound() {
        System.out.println("Cat sounds!!!");
    }
}
