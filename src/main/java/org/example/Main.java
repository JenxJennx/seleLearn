package org.example;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setFuelMileage(90);
        car1.Drives();
        System.out.println(car1.getFuelMileage());
        Motorcycle motorcycle1 = new Motorcycle();
        motorcycle1.Drives();
    }
}