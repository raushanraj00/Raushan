package EXCEPTION_HANDLING.Try_catch;

public class demo2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            methodA(a, b);
        }catch (ArithmeticException e){
            System.out.println("Illegal Division.");
        }
    }

    public static void methodA(int a, int b) {
        methodB(a,b);
    };

    public static void methodB(int a, int b) {
        System.out.println(a/b) ;
    }
}
