package com.inheritance;

public class Human {
    String name;
    int age;
    String gender;

    Human() {
    }

    Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    protected void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Gender : " + gender);
    }
    void walk() {
        System.out.println("Human walking..");
    }

    //Not able to access outside the Human class, as this is private
    private void read() {
        System.out.println("Human reading..");
    }
    public void eat() {
        System.out.println("Human eating..");
    }

    void run(String message) {
        System.out.println(message);
    }
}
