package org.example;

public class Vehicle {
    protected int speed;

    public void accelerate(int amount) {
        speed += amount;
    }
}

class Car extends Vehicle {
    private int fuelLevel;

    public void refuel(int amount) {
        fuelLevel += amount;
    }
}

