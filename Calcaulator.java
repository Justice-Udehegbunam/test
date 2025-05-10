/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.labsession1e.calcaulator;

/**
 *
 * @author Justice
 */
public class Calcaulator {

    // Method to add two integers
    public int add(int a, int b) {
        System.out.println("Adding two integers");
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        System.out.println("Adding three integers");
        return a + b + c;
    }

    // Overloaded method to add two doubles
    public double add(double a, double b) {
        System.out.println("Adding two doubles");
        return a + b;
    }

    public static void main(String[] args) {
        Calcaulator calc = new Calcaulator();

        int sum1 = calc.add(5, 10);         // Calls the add(int, int) method
        int sum2 = calc.add(5, 10, 15);      // Calls the add(int, int, int) method
        double sum3 = calc.add(2.5, 3.7);    // Calls the add(double, double) method

        System.out.println("Sum 1: " + sum1);
        System.out.println("Sum 2: " + sum2);
        System.out.println("Sum 3: " + sum3);
    }
}