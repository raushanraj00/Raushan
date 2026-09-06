package EXCEPTION_HANDLING;

public class login_system {
    static void login(String username, String password){
        if(!username.equals("admin")){
            throw new IllegalArgumentException("Invalid Username.");
        }
        if(!password.equals("1234")){
            throw new IllegalArgumentException(("Invalid password."));
        }
        System.out.println("Login Successful.");
    }

    public static void main(String[] args) {
        try{
            login("admin", "1234");
        }catch (IllegalArgumentException e){
            System.out.println("Login failed : "+ e.getMessage());
        }
    }

}
