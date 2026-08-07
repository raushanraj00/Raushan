package JAVA_OOPS_YT;

class circle{
    private  int radius;
    public void setRadius(int n){
        this.radius = n;
    }
    public int getRadius(){
        return radius;
    }
}
public class setters_and_getters_circle_valid {
    public static void main(String[] args) {
        circle c1 = new circle();
        c1.setRadius(10);
        System.out.println(c1.getRadius());
    }
}
