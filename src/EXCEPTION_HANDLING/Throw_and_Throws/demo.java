package EXCEPTION_HANDLING.Throw_and_Throws;

//Now comes one of the most important concepts.
//
//        throw is used when you manually want to generate an exception.

// EXAMPLE "- throw new ArithmeticException("Something went wrong");
public class demo {
    public static void main(String[] args) {
        int age = 10;
        if(age<10){
            throw new ArithmeticException("You are not Eligible.");
        }
        System.out.println("Eligible.");
    }
}
