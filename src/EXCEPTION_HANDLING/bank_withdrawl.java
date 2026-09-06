package EXCEPTION_HANDLING;

public class bank_withdrawl {
    static void withdraw(double balance, double amount){
        if(amount<0){
            throw new IllegalArgumentException("Balance Should be Positive");
        }
        if(amount > balance){
            throw new IllegalArgumentException("Insufficient Balance.");
        }
        System.out.println("Withdrawl Successful : ₹"+amount );
        System.out.println("Available Balance : ₹"+(balance-amount));
    }

    public static void main(String[] args) {
        try{
            withdraw(10000, 15000);
        } catch (IllegalArgumentException e){
            System.out.println("Error : "+e.getMessage());
        }
        finally {
            System.out.println("Thankyou For using our bank. :) ");
        }
    }
}
