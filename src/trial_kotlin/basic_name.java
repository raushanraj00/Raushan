package trial_kotlin;
import java.util.Scanner;
public class basic_name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age:- ");
        int age = sc.nextInt();
        System.out.println("Enter Grade:- ");
        char grade = sc.next().charAt(0);
        System.out.println(age + " " +  grade);

    }
}
