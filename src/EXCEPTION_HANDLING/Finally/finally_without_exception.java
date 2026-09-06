package EXCEPTION_HANDLING.Finally;

public class finally_without_exception {
    public static void main(String[] args) {
        try {
            int result = 10 / 2;
            System.out.println(result);
        }
        catch (Exception e){
            System.out.println("Error.");
        }
        finally {
            System.out.println("Finally executed.");
        }
    }
}
