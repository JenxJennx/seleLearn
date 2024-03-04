package org.example;

public abstract class Vehicle {

    private int fuelMileage;

    private int ID;
    public final String Brand = "Toyota";

    public int getFuelMileage() {
        return fuelMileage;
    }

    public void setFuelMileage(int fuelMileage) {
        this.fuelMileage = fuelMileage;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getBrand() {
        return Brand;
    }

    public abstract void Drives();
}
