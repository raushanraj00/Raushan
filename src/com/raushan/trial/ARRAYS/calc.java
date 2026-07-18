package com.raushan.trial.ARRAYS;
import java.util.Scanner;
public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number ! ");
        double num1 = sc.nextDouble();
        System.out.println("Enter the operation.(+,-,*,/)");
        char ch = sc.next().charAt(0);
        System.out.println("Enrer 2nd Number :- ");
        double num2 = sc.nextDouble();
        double result = 0;
        switch (ch) {
            case '+' :
                result = num1 + num2;
                break;
            case '-' :
                result = num1 - num2;
                break;
            case '*' :
                result = num1 * num2;
                break;
            case '/' :
                result = num1/num2;
                break;
        }

        System.out.println("Your Answer is :- " + result);


            }
}
