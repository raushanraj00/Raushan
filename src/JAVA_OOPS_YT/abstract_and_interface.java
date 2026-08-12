package JAVA_OOPS_YT;

interface bicycle{
    int a = 20 ;
    void applybreak(int dec);
    void speedup(int asc);
}
class mountainbike implements bicycle{
    void blowhorn(){
        System.out.println("Pee pee");
    }
    public void applybreak(int dec){
        System.out.println("Applying Break.");
    }
    public void  speedup(int asc){
        System.out.println("Speeding Up.");
    }
}
public class abstract_and_interface {
    public static void main(String[] args) {
        mountainbike m1 = new mountainbike();
        m1.applybreak(1);
        System.out.println(m1.a);
//        m1.a = 24;
        // you can't modify the defined valllues of interfaces.. as
        // if a = 20 in interface then you cant make m1.a = 3994;
        // a = final variable @
    }
}
