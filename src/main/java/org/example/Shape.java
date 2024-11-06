package org.example;

public abstract class Shape {
    public abstract double calculateArea();
    // Concrete method
    public void displayShape() {
        System.out.println("Displaying shape.");
    }
}

class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    // Implementation of abstract method
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
