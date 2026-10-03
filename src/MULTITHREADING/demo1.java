package MULTITHREADING;

class A extends Thread{
    public void show(){
        for(int i = 1 ; i<=100; i++){
            System.out.println(i + " hi");
        }
    }
    public void run(){
        show();
    }

}
class B extends  Thread {
    public void show(){
        for(int i = 1 ; i<=100; i++){
            System.out.println(i + " hello");
        }
    }
    public void run(){
        show();
    }
}
public class demo1 {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
    }
}
