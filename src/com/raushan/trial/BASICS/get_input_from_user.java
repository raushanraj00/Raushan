package com.raushan.trial.BASICS;
import java.util.Scanner;
public class get_input_from_user {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter You CGPA :- ");
        double cgpa = myObj.nextDouble();

        if(cgpa >= 8){
            System.out.println("Congratulations! You are Qualified.");
        }
        else{
            System.out.println("Sorry ! You are not Qualified.");
        }
    }
}
