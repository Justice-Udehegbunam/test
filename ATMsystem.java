/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.labsession1e.atmsystem;

import java.util.Scanner;

/**
 *
 * @author Justice
 */
public class ATMsystem {

    private double balance; 

    public ATMsystem(double initialBalance) {
        this.balance = initialBalance;
    }

    public void checkBalance() {
        System.out.println("Current Balance: N" + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("N" + amount + " deposited successfully.");
            checkBalance(); // Show updated balance
        } else {
            System.out.println("Invalid deposit amount. Please enter an amount greater than zero.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("N" + amount + " withdrawn successfully.");
                checkBalance(); // Show updated balance
            } else {
                System.out.println("Insufficient funds. Please enter an amount less than or equal to your balance.");
            }
        } else {
            System.out.println("Invalid withdrawal amount. Please enter an amount greater than zero.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATMsystem atm = new ATMsystem(1000.0); // Initialize with a balance of $1000

        while (true) {
            System.out.println("\nWelcome to the ATM System");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = 0;
            try {
                choice = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
                scanner.next(); 
                continue; //restart the loop
            }

            switch (choice) {
                case 1 -> atm.checkBalance();
                case 2 -> {
                    System.out.print("Enter the amount to deposit: N");
                    double depositAmount = 0;
                    //try catch added to secure valid input from user
                    try {
                        depositAmount = scanner.nextDouble();
                    } catch (Exception e) {
                        System.out.println("Invalid input. Please enter a valid amount.");
                        scanner.next(); //clear the invalid input
                        break; //exit the switch, go to next iteration of while
                    }
                    atm.deposit(depositAmount);
                }
                case 3 -> {
                    System.out.print("Enter the amount to withdraw: N");
                    double withdrawAmount = 0;
                    //try catch added to secure valid input from user
                    try {
                        withdrawAmount = scanner.nextDouble();
                    } catch (Exception e) {
                        System.out.println("Invalid input. Please enter a valid amount.");
                        scanner.next(); //clear the invalid input
                        break; //exit the switch, go to next iteration of while

                    }
                    atm.withdraw(withdrawAmount);
                }
                case 4 -> {
                    System.out.println("Thank you for using the ATM System. Goodbye!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}
