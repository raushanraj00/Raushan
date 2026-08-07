package JAVA_OOPS_YT;

class Employee{
    private int id;
    private String name;

    public  void setName(String n){
//        name = n;
        this.name = n;
    }
    public String getName(){
        return name;
    }

    public  void setname(int i ){
//        id = i;
        this.id = i;
    }
    public int getid(){
        return id ;
    }
}
public class setters_and_getters {
    public static void main(String[] args) {
        Employee e1 = new Employee();
//        e1.id = 12 ;
//        e1.name = "Ruahd ";
        e1.setName("Raushan");
        System.out.println(e1.getName());

    }
}
