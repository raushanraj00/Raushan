package com.raushan.trial.OOPS.Classes_and_Objects;

abstract class Person {
    Person() {
        System.out.println("Person Constructor");
    }
    abstract void work();
}
class Employee extends Person{
        Employee(){
            System.out.println("Employee Constructor.");
        }
        void work(){
            System.out.println("Employee is Working.");
        }
        }
public class abstract_class {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.work();
    }
}
