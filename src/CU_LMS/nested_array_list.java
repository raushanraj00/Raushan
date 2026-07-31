package CU_LMS;

import java.util.ArrayList;
import java.util.Scanner;

public class nested_array_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(10);
        row1.add(20);
        row1.add(30);

        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(40);
        row2.add(50);

        ArrayList<Integer> row3 = new ArrayList<>();
        row3.add(60);
        row3.add(70);
        row3.add(80);
        row3.add(90);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.add(row1);
        list.add(row2);
        list.add(row3);

        System.out.println("Array List:- "+ list);
    }
}
