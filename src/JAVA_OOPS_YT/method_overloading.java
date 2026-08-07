package JAVA_OOPS_YT;

class calculator{
     int add(int a, int b, int c){
        return a+b+c;
    }
    int add(int a, int b){
         return a+b;
    }
    double add (double a, double b) {
        return a + b;
    }
}
public class method_overloading {
    public static void main(String[] args) {
        calculator c1 = new calculator();
        System.out.println(c1.add(1,2,4));
        System.out.println(c1.add(1,2));
    }
}
