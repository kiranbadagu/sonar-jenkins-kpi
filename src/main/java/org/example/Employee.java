package org.example;

public class Employee {
    private String Name;
    private double experience;
    private double Salary;

    public  String getName(){
        return Name;
    }

    public void setName(String name) {
        this.Name=name;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public double getSalary() {
         return Salary;
    }

    public void setSalary(double salary) {
        if (Salary >= 0) {
            this.Salary = salary;
        }

    }

}
