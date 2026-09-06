package EXCEPTION_HANDLING.Try_catch;

public class basic_eg {
    public static void main(String[] args) {
        try {

//            int a=10,b=0;
//            int result = 0;
//            result = a/b;
//            System.out.println(result);
            int[] arr1 = {12,23,34,45};
            System.out.println(arr1[5]);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception.");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index Calling.");
        }
        catch (Exception e){
            System.out.println("Exception Handled!");
        }
        System.out.println("Program Finished.");

    }
}
