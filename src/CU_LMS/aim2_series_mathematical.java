package CU_LMS;

import java.util.Scanner;

public class aim2_series_mathematical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        for(int que = 0; que<q ; que++){
            int a = sc.nextInt(); int b = sc.nextInt(); int n = sc.nextInt();
            int term = a;
            for(int i =0; i<n; i++){
                term += (int) Math.pow(2, i) * b;
                System.out.print(term + " ");
            }
            System.out.println();


        }
    }
}
