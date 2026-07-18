package com.raushan.trial.BASICS;
import java.util.Scanner;
public class smart_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Number:- ");
        double num1 = sc.nextDouble();

        System.out.println("Enter the character:- ");
        char op = sc.next().charAt(0);

        System.out.println("Enter 2nd Number:- ");
        double num2 = sc.nextDouble();
        double result = 0;
        // +,-,*,/
        switch (op) {
            case '+' :
                result = num1 + num2 ;
                break;
            case '-' :
                result = num1 - num2;
                break;
            case '*' :

                result = num1 * num2;
                break;
            case '/' :
                result = num1 / num2;
        }

        System.out.println("The Calculation is :- " + result);
    }
}
