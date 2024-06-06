/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.bytebasetech.everything_java_beginner;

import java.util.Scanner;

/**
 *
 * @author BYTEBASE-ACE
 */
public class EVERYTHING_JAVA_BEGINNER {
    
    public static void main(String[] args) {

        // instantiate operators
        OPERATORS operators = new OPERATORS();
    
        Scanner input = new Scanner(System.in);
        
        // get first number from screen
        System.out.print("Enter first number: ");
        operators.setX(input.nextInt());
        
        // get second number from screen
        System.out.print("Enter second number: ");
        operators.setY(input.nextInt());
        
        System.out.println("Addition: " + operators.addition());
        
        System.out.println("Subtraction: " + operators.subtraction());
        
        System.out.println("division: " + operators.division());
        
        System.out.println("Multiplication: " + operators.multiplication());
    }
}
