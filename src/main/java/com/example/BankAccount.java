package com.example;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        // TODO: Initialize the balance
        this.balance = balance;
    }

    public void deposit(double amount) {
        // TODO: Increase the balance by the value of the amount parameter
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        // TODO: Decrease the balance by the value of the amount parameter. 
        // Ensure that the balance does not become negative.
        balance = balance - amount;
        if (balance < 0 ){
            balance = balance + amount;
        }
    }

    public double getBalance() {
        // TODO: Return the current balance
        return balance;  // Change this default return statement
    }
}
