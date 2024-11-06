package org.example;

public class BankAccount {
    private double balance; // Private variable, encapsulated data

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Public method to get balance
    public double getBalance() {
        return balance;
    }
    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
