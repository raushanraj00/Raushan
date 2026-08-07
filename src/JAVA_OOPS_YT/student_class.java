package JAVA_OOPS_YT;

import java.util.Scanner;

public class student_class {
//    public static class student{
//        // creating new datatypes ;
//        String name;
//        int roll;
//        double percent;
//    } // simmilarly i can put this class inside my PSVM main class by removing public static and hust class cars there;
    public static void function(student s){
        s.name = "Raushan Raj"; // name updated as it is pass by reference
        System.out.println(s.name);
        // THAT's why classes are passed by reference !
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        student x = new student(); // declaration
        x.name = "Raushan";
        x.percent = 85;
        x.roll = 02;

        student s = new student();
        s.name = "Shruti";
        s.percent = 87.4;
        s.roll = 5;
        function(x);
    }
}
