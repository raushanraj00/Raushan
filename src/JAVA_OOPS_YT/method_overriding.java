package JAVA_OOPS_YT;

class A{
    public void show(){
        System.out.println("I will show");
    }
    public void config(){
        System.out.println("I will config");
    }
}
class B extends  A {
    public void show(){
        System.out.println("I will not show. ");
    }
}
public class method_overriding {
    public static void main(String[] args) {

        B obj = new B();
        obj.show();
    }
}
