package com.raushan.trial.OOPS.Classes_and_Objects;

import java.util.Scanner;
abstract class Book {
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;

    }
}
class mybook extends Book {
    void setTitle(String s){
        this.title = s;
    }
}
public class abstract_and_inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        mybook novel = new mybook();
        novel.setTitle(title);
        System.out.println("The Title is :- "+novel.getTitle());
        sc.close();
    }
}