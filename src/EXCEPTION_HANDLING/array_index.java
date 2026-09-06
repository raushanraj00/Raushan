package EXCEPTION_HANDLING;

import java.util.Scanner;

public class array_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12,34,45,56,67,78,87};
        System.out.println("Enter Index:");
        int a = sc.nextInt();

        try{
            System.out.println("Value : "+ arr[a]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index.");
        }
    }
}
