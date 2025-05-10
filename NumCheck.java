/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.labsession1e.numcheck;

import java.util.Scanner;

/**
 *
 * @author Justice
 */
public class NumCheck {
  public static void main(String[] args) {
        int num;
        Scanner myNum = new Scanner(System.in);
        System.out.print("Enter your number: ");
        num = myNum.nextInt();

        if (num % 2 == 1) {
            System.out.print("This " + num + " is an odd number ");
        } else {
        System.out.print("This" + num + " is an even number ");
        }
    }
}


