package EXCEPTION_HANDLING.Try_catch;

public class error_identification {
    public static void main(String[] args) {
        int [] arr1 =  {12,24,36,72};
        int [] arr2 = {2,4,0,8};
        for(int i = 0; i< arr1.length ; i++){
            System.out.println(divide(arr1[i], arr2[i]));
        }

        System.out.println("Good Job");
    }
    public static  int divide(int a, int b) {
        try {
            return a / b;
        }catch (ArithmeticException e){
            return -1;
        }
    }
}
