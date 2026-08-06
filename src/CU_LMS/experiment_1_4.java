package CU_LMS;


import java.util.Scanner;

public class experiment_1_4 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter word: ");
//        String s = sc.next();
//        s = s.toLowerCase();
//        String reversed = "";
//
//        for(int i = s.length()-1; i>=0; i--){
//            reversed = reversed + s.charAt(i);
//        }
//
//        if(s.equals(reversed)){
//            System.out.println("Yes");
//        }
//        else System.out.println("No");
//    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Word: ");
    String s = sc.next();
    s = s.toLowerCase();
    boolean pallindrome = true;
    int l = 0 , r = s.length()-1;
    while(l<r){
        if(s.charAt(l)!=s.charAt(r)){
            pallindrome = false;
            break;
        }
        l++;
        r--;
    }
    if(pallindrome){
        System.out.println("Pallindrome. ");
    }
    else {
        System.out.println("Not Pallindrome. ");
    }
}
}
