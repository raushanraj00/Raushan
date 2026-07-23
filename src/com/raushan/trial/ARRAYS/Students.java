package com.raushan.trial.ARRAYS;

import java.util.Scanner;

public class Students{
    public int roll;
    public String name;
    Students(int roll, String name){
        this.roll= roll;
        this.name = name;
    }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter No. of Students:-");
            int size = sc.nextInt();
            Students[] arr = new Students[size];

            for (int i = 0; i < size; i++) {
                System.out.println("Enter details for Student " + (i + 1));
                System.out.println("Enter roll Number :- ");
                int roll = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter Name:- ");
                String Name = sc.nextLine();
                arr[i] = new Students(roll, Name);
            }

            System.out.println("Student Details :- ");
            for (int i = 0; i < size; i++) {
                System.out.println("Student " + i + " : ("+ arr[i].roll + " " + arr[i].name + ") ");
            }
        }
    }
