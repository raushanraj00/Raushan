package EXCEPTION_HANDLING.Try_catch;

public class hierarchy_exceptions {
    public static void main(String[] args) {
        int[] arr1 = {12,24,36,48};
        int[] arr2 = {2,4,0,8};

        for(int i = 0; i<arr1.length; i++){
            System.out.println(divide(arr1[i],arr2[i]));
        }
    }

    public static int divide(int a, int b) {
        try{

            return a/b;

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception.");
            return -1;
        } catch (NullPointerException e){
            System.out.println("Null Pointer error.");
            return -1;
        }catch (Exception e){
            System.out.println("Exception Here.");
            return -1;
        }
    }
}
