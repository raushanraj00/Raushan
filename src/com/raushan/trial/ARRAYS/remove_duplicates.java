package com.raushan.trial.ARRAYS;

public class remove_duplicates {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,4,3,4,57,8};
        int length = arr.length;
        for(int i = 0; i<length ; i++){
            for(int j = i+1; j<length; j++){
                if(arr[i] == arr[j]){
                    for(int k = j; k<length-1;k++){
                        arr[k] = arr[k+1];
                    }
                    length --;
                    j--;
                }
            }
        }
        for(int i = 0; i<length ; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
