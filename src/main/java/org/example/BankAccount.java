package org.example;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double deposit(double amount) {
        if (amount > 0) {
            balance += amount;
           // System.out.println("Deposited amount is Rs. " + amount);
            return balance;
        } else {
            System.out.println("Invalid deposit amount");
            return amount;
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn Rs. " + amount);
           // return amount;
        } else {
            System.out.println("Insufficient balance " );
        }
    }
    public void checkingBalance() {
        System.out.println("Please enter Account Number: " + accountNumber);
        System.out.println("Current Balance in Your account : Rs. " + balance);
    }
}
