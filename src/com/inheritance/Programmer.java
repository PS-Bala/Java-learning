package com.inheritance;

public class Programmer extends Employee {
    int bonusPercentage = 25;
    Programmer(String name, int age, String gender, String designation, float experiance, double salary) {
        super(name, age, gender, designation, experiance, salary);
    }
    public double getBonusAmount() {
        return ((salary / 100)* bonusPercentage);
    }
}
