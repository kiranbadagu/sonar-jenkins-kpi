package org.example;

   public class Person {
        String Name;
        int age;

        public void display() {
            System.out.println("Name: " + Name);
            System.out.println("Age: " + age);
        }
    }

    class Emp extends Person {
        String employeeID;
        String Department;
        String Designation;

        public void displayEmpDetails() {
            display();
            System.out.println(" Employee ID : " + employeeID);
            System.out.println("Department : " + Department);
            System.out.println("Designation : " + Designation);
        }

    }

    class Manager extends Emp {
        int Teamsize;
        public void displayManagerDetails() {
            displayEmpDetails();
            System.out.println("Team Size: " + Teamsize);
        }
    }

