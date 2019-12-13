package com.oop;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Car implements Cloneable {
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    String name = "Maruthi Suzuki";

    public Car(String name) {
        this.name = name;
    }

    void run() {
        System.out.println(name +" Car is running");
    }
}

public class ObjectCreation {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, CloneNotSupportedException {
//        Type 1
//        Car car = new Car("Ford");
//        System.out.println("car name:" + car.name);

//        Type 2 -  work in default constructor only
//        Car car = Car.class.newInstance();
//        System.out.println("car name:" + car.name);

//        Type 3 - work in default constructor only
//        Class aClass = Class.forName("com.oop.Car");
//        Car car = (Car) aClass.newInstance();
//        System.out.println("car name:" + car.name);

//        Type 4 -  works in default and parameterised constructor
        Constructor<Car> obj = Car.class.getConstructor(String.class);
        Car car  = obj.newInstance("Ford");
//        System.out.println("car name:" + car.name);

//        Clone
        Car car1 = (Car) car.clone();
        car1.name = "Honda";
        System.out.println("car name:" + car.name);
        System.out.println("car name:" + car1.name);
        System.out.println("car name:" + car.name);

    }
}
