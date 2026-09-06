package EXCEPTION_HANDLING.Throw;

public class throw_and_catch {
    public static void main(String[] args) {
        int age = 9;
        if (age < 10) {
            try {
                throw new ArithmeticException("You are not eligible!.");
            } catch (ArithmeticException e) {
                System.out.println("Exception Caught.");
                System.out.println(e.getMessage());
            }
        }
            else {
                System.out.println("Eligible.");
            }
        }
    }
