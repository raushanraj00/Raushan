package com.raushan.trial.ARRAYS;

import java.util.Scanner;

public class array_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter marks for Student "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }

        // now for printing :-
        System.out.println("Student Marks List ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Student "+ (i+1) + ": "+ arr[i]);

        }
    }
}
