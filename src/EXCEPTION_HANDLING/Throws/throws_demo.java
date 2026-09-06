//throws is used in a method declaration.
//The method is basically saying:
//
//        "This method might throw this exception. Whoever calls me should be aware of it."
package EXCEPTION_HANDLING.Throws;

public class throws_demo {
    public static int divide(int a , int b){
        return a/b;
    }
    public static void main(String[] args) {
        try{
            int x = divide(10,0);
            System.out.println(x);
        } catch (ArithmeticException e){
            System.out.println("Exception Handled.");
        }
    }
}
