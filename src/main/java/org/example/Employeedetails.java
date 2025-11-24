package org.example;

public class Employeedetails {
    String Name;
    int empId;
    String Branch;
    String Designation;
    public Employeedetails(String Name,int empId,String Branch,String Designation){
        this.Name=Name;
        this.empId=empId;
        this.Designation=Designation;
        this.Branch=Branch;
    }
    public void Display(){
        System.out.println("Employee Name : " + Name);
        System.out.println("Employee ID :  " +empId );
        System.out.println("Designation : " + Designation);
        System.out.println("Department : " + Branch);
    }
}
