package EXCEPTION_HANDLING;

import java.util.Scanner;

public class student_marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks:");
        int a = sc.nextInt();

        try{
                if(a<0 || a>100){
                    throw new IllegalArgumentException("Marks must be between 0 to 100");
                }
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
