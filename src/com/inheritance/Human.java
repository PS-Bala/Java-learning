package com.inheritance;

public abstract class Human {
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
    public void walk() {
        System.out.println("walking..");
    }
    public void read() {
        System.out.println("reading..");
    }
    public abstract void eat();
}
