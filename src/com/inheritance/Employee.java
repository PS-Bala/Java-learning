package com.inheritance;

public class Employee extends Human {
    String designation;
    float experiance;

    Employee() {

    }
    Employee(String designation, float experiance){
        this.designation = designation;
        this.experiance = experiance;
    }
    public void working() {
        System.out.println("Employee working...");
    }
    @Override
    public void eat() {
        System.out.println("Employee eating..");
    }
}
