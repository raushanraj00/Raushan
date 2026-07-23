package com.raushan.trial.ARRAYS;

public class primitive_and_non_array {
    public static void main(String[] args) {
        int[] arr = {10,20,40,50,60,80};
        int n= arr.length;

        System.out.println("Primitive Array :- ");
        for (int i = 0; i < n; i++) {
            System.out.printf(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Non Primitive Array:- ");
        String[] Names = {"Raushan", "Hello", "Morning"};
        n = Names.length;
        for (int i = 0; i < n; i++) {
            System.out.printf(Names[i]+", ");
        }

        System.out.println("1st Name is "+Names[0]);
    }
}
