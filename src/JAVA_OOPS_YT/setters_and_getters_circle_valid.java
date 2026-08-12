package JAVA_OOPS_YT;

class circle{
    private double radius;
    public void setRadius(int n){
        if(n<0){
            System.out.println("Radius can't be Negative.");
            return ;
        }
        this.radius = n;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public  double getCircumference(){
        return 2*Math.PI*radius;
    }

}
public class setters_and_getters_circle_valid {
    public static void main(String[] args) {
        circle c1 = new circle();
        c1.setRadius(10);
        System.out.println(c1.getRadius());
        System.out.println(c1.getArea());
        System.out.println(c1.getCircumference());
    }
}
