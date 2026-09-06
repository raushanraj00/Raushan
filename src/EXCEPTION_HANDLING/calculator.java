package EXCEPTION_HANDLING;

import java.util.InputMismatchException;
import java.util.Scanner;

public class calculator {
    public static int result(int a, int b, char op){
        switch (op){
            case ('+'):
                return a+b;
            case ('-'):
                return a-b;
            case ('*'):
                return a*b;
            case ('/'):
                return a/b;
            case ('%'):
                return a%b;
            default:
                throw new IllegalArgumentException("Illegal Operation Please try (+,-,*,/,%)");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("Enter 1st Number:");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number:");
        int b = sc.nextInt();
        System.out.println("Enter Operation:- ");
        char op = sc.next().charAt(0);
        int ans = result(a,b,op);
            System.out.println("Result:"+ ans);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception.");
        } catch (InputMismatchException e){
            System.out.println("Please Enter Valid Integers and numbers");
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            sc.close();
            System.out.println("Program Completed ! ");
        }
    }
}
