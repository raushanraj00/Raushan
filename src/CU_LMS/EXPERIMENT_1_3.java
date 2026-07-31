package CU_LMS;

import java.util.ArrayList;
import java.util.Scanner;

public class EXPERIMENT_1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i = 0; i<n; i++){
            int d = sc.nextInt(); //  number of elementss in a line !
                ArrayList<Integer> row = new ArrayList<>();

            for(int j = 0; j<d ; j++ ){
                row.add(sc.nextInt());
            }
            list.add(row) ;
        }

    }
}
