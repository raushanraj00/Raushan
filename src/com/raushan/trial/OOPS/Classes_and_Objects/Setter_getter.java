package com.raushan.trial.OOPS.Classes_and_Objects;


class Student{
    private String name ;
    private String uid;
    private int age;

    public Student(String name, String uid, int age){
        this.name  = name;
        this.uid = uid;
        setAge(age);
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getUid(){
        return uid;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age>18 && age<=30){
            this.age = age;
        }
        else{
            System.out.println("Please Enter an elegible age.(setting age to 0)");
            this.age = 0;
        }
    }
    void display(){
        System.out.println("Name :- "+name);
        System.out.println("UID :- "+uid);
        System.out.println("Age :- "+age);
        System.out.println("--------------------------------");
    }
}

public class Setter_getter{

    public static void main(String[] args){
        Student Student1 = new Student("Raushan","25BCS13241",89);

        System.out.println("Initial Details...");
        Student1.display();

        System.out.println("Updating GPA...");
        Student1.setAge(18);

        System.out.println("New GPA via Getter: " + Student1.getAge());
    }
}