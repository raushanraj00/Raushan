package com.raushan.trial.OOPS.Classes_and_Objects;

import jdk.nashorn.internal.runtime.regexp.joni.exception.SyntaxException;

import java.util.Scanner;

class Student{
    String name;
    String uid;
    double gpa;

    Student(String name, String uid , double gpa) {
        this.name = name;
        this.uid = uid;
        this.gpa = gpa;
    }
    void Display(){
        System.out.println("Name :- "+name );
        System.out.println("uid :- " +uid );
        System.out.println("GPA :- "+gpa );
        System.out.println("-----------------------");
    }
}
//public class basic1{
//    public static void main(String[] args) {
//        Student s1 = new Student("Raushan","25BCS13241",9.8);
//        Student s2 = new Student("Rohit", "25BCS13241", 8.5);
//
//        System.out.println("Student 1 Details:- ");
//        s1.Display();
//        System.out.println("Student 2 Details:- ");
//        s2.Display();
//    }
//}                         PREDIFEND CLASS
public class basic1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No. Of Students:- ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] Students = new Student[n];

        for(int i = 0 ; i<n; i++){
            System.out.println("Enter Details for Student "+(i+1) + ": ");

            System.out.println("Enter Name:- ");
            String name = sc.nextLine();

            System.out.println("Enter UID:- ");
            String uid = sc.nextLine();

            System.out.println("Enter GPA:- ");
            double gpa = sc.nextDouble();
            sc.nextLine();

            Students[i] = new Student(name,uid,gpa);
        }

        for(int i = 0; i<n ; i++){
            Students[i].Display();
        }

    }
}