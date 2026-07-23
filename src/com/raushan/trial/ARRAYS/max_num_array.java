package com.raushan.trial.ARRAYS;

import java.util.Scanner;

public class max_num_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers :- ");
        for(int i = 0; i<5; i++){
            numbers[i] = sc.nextInt();
         }
        int a = numbers[0];
        for(int i = 0; i<5; i++){
            if(a < numbers[i]){
                a = numbers[i];
            }
        }
        System.out.println("The Max Number is :- " + a );
    }
}
