package com.inheritance;

public class Employee extends Human {
    String designation;
    float experiance;
    double salary;
    Employee() {
        super();
    }

    Employee(String name, int age, String gender, String designation, float experiance, double salary){
        super(name, age, gender);
        this.designation = designation;
        this.experiance = experiance;
        this.salary = salary;
    }
    @Override
    protected void displayDetails() {
        System.out.println("Name : " +name);
        System.out.println("Age : " +age);
        System.out.println("Gender : " +gender);
        System.out.println("Designation : " +designation);
        System.out.println("Experiance : " +experiance);
        System.out.println("Salary : " +salary);
        super.run("Super class \"run\" method called use super keyword");
    }
    public void working() {
        System.out.println("Employee working...");
    }
}
