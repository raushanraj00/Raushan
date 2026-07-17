package CU_LMS;
import java.util.Scanner;
public class student_grade_calc {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter your Marks:- ");
        double marks = sc.nextDouble();
        System.out.println("Your Grade is:- ");
        if (marks>=90) System.out.println("A+");
        else if(marks>=80) System.out.println("A");
        else if (marks>=70) System.out.println("B+");
        else if (marks>=60) System.out.println("B");
        else if (marks>=50) System.out.println("C");
        else if (marks < 50) System.out.println("F");

    }
}
