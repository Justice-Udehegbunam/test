/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.labsession1e.labsession2;
import java.util.Scanner;

/**
 *
 * @author Justice
 */
public class Labsession2 {

    public static void main(String[] args) {
        int num1, num2, result;
        Scanner myinput = new Scanner(System.in);
        System.out.print("Enter num 1: ");
        num1 =  myinput.nextInt();
         System.out.print("Enter num 2: ");
        num2 =  myinput.nextInt();
        result = num1 + num2; 
        
        System.out.print("Your result is " + result);

    }
}
