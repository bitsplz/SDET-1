package org.example;

public class ExceptionExample {
    public static void divide(int a, int b) {
        try {
            int dividend = a;
            int divisor = b;
            int result = a / b;  // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e.getMessage());
        } finally {
            System.out.println("Execution completed....code cleanup in-progress......");
        }
    }
    public static void validateAge(int age) {
        if (age < 1) {
            throw new IllegalArgumentException("Age must be 1 or older.");
        }
        System.out.println("Valid age");
    }
}
