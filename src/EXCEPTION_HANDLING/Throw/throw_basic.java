
//Now comes one of the most important concepts.
//
//        throw is used when you manually want to generate an exception.

// EXAMPLE "- throw new ArithmeticException("Something went wrong");
// THROW SYNTAX :_------------ throw new EXCEPTION_NAME ("MESSAGE");
package EXCEPTION_HANDLING.Throw;


public class throw_basic {
    public static void main(String[] args) {
        int age = 10;
        if(age<10){
            throw new ArithmeticException("You are not Eligible.");
        }
        System.out.println("Eligible.");
    }
}
