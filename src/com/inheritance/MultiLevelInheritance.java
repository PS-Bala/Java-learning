package com.inheritance;

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Programmer  programmer = new Programmer("Bala", 28, "Male", "Technical consultant", 5.6F, 25000d );
        programmer.displayDetails();
        System.out.println("Bonus Amount: "+programmer.getBonusAmount());
    }
}
