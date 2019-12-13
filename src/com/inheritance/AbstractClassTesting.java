package com.inheritance;

abstract class Desktop {
    protected String cpu;
    protected String moniter;
    protected String keyboard;
    abstract public void configureCpu();
    abstract public void configureMoniter();
    abstract public void configureKeyboard();
    void displayDetails() {
        System.out.println("CPU : " + cpu);
        System.out.println("Moniter : " + moniter);
        System.out.println("Keyboard : " + keyboard);
    }

}

class Dell extends Desktop {
    public String os;
    public Dell(String os) {
        this.os = os;
    }

    @Override
    public void configureCpu() {
        System.out.println("Configure CPU overriten");
        cpu = "Dell";
    }

    @Override
    public void configureMoniter() {
        System.out.println("Configure moniter overriten");
        moniter = "Dell";
    }

    @Override
    public void configureKeyboard() {
        System.out.println("Configure keyboard overriten");
        keyboard = "Dell";
    }

}

public class AbstractClassTesting {
    public static void main(String[] args) {
        Dell dell = new Dell("Windows 10");
        dell.configureCpu();
        dell.configureMoniter();
        dell.configureKeyboard();
        dell.displayDetails();
    }
}
