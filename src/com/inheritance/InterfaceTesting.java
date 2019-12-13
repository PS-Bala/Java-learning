package com.inheritance;

interface Car {
//    Public static and final
    int EngineCC = 2000;
//    Public and abstract
    public void run();
    public void stop();
}

class Ford implements Car {
    int EngineCC = 4000;
    @Override
    public void run() {
        System.out.println("Ford car is running");
    }

    @Override
    public void stop() {
        System.out.println("Ford car stopped");
    }
}

public class InterfaceTesting {
    public static void main(String[] args) {
        Ford ford = new Ford();
        System.out.println("Ford Car Engine CC : " + ford.EngineCC);
        System.out.println("Car Engine CC : " + Car.EngineCC);
        ford.run();
        ford.stop();
    }
}
