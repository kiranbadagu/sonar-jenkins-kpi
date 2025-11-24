package org.training;

public class Main {
    public static void main(String[] args) {

        /*thisEx student=new thisEx("karthik",135);   //This keyword*/

        Product p1=new Product(1,"Gamingsetup",150000);
        Product p2=new Product(2,"Laptop",75000);
        Product p3=new Product(3,"Phone",150000);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("p1  is equal to p2 : " + p1.equals(p2));
        System.out.println("p1  is equal to p3 : " + p1.equals(p3));
    }
}
