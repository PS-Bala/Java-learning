package com.inheritance;

//This is an example of runtime polymorphism
public class SingleInheritance {
    public static void main(String[] args){
        System.out.println("Print employee details");
        Employee employee;
        employee = new Employee("Bala", 28, "Male", "Technical consultant", 5.6F, 25000d );
        employee.displayDetails();
//        employee.read();
        employee.working();
        employee.eat();
        System.out.println("");
        System.out.println("Print Human details");
        Human human = new Human("Gowtham", 21, "Male");
        human.displayDetails();
//        human.read();
        human.eat();
    }
}
