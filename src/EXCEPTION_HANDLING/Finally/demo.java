//
//The finally block is used for code that should execute regardless of whether an exception occurs.
//Why is finally Useful?
//
//One major use is resource cleanup.
//
//For example:
//
//File opened
//Database connection opened
//Network connection opened
//
//After using them, they should be closed.
package EXCEPTION_HANDLING.Finally;

public class demo {
    public static void main(String[] args) {
        try{
            int result = 10/0;
        } catch (ArithmeticException e){
            System.out.println("Arithmetic Exception.");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Out of Index exception.");
        } catch (Exception e){
            System.out.println("Exception Handled.");
        }
        finally {
            System.out.println("Finally Executed.");
        }
    }
}
