package com.raushan.trial.ARRAYS;

public class check_sorted {
    public static void main(String[] args) {
        int[] arr11 = {1,3,5,7};
        int[] arr1 = {1,2,6,4};
        boolean Sorted = true;
        for(int i = 0; i < arr1.length - 1; i++){
            if(arr1[i]>arr1[i+1]) {
                Sorted = false;
                break;
            }
        }
        if(Sorted) {
            System.out.println("Array is Sorted.");
        }
        else {
            System.out.println("Array Is not sorted! ");
        }
    }


}
