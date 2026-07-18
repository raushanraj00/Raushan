package com.raushan.trial.BASICS;

import java.util.Scanner;
public class simple_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Number:- ");
        int num1  = sc.nextInt();

        System.out.println("Enter 2nd Number:- ");
        int num2 = sc.nextInt();

        int  sum = num1 + num2 ;
        System.out.println("Sum is :- " + sum);

    }
}
