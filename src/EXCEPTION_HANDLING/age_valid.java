package EXCEPTION_HANDLING;

import java.util.Scanner;

public class age_valid {
    static  void checkage(int age){
        if(age<18){
            throw new IllegalArgumentException("Age must be 18.");
        }
        System.out.println("Eligible.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age : ");
        int a = sc.nextInt();

        try{
            checkage(a);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
