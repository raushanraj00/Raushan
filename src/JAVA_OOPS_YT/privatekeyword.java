package JAVA_OOPS_YT;

class Students{
    String name;
    private int uid;
    double cgpa;
    private void print(){
        System.out.println(name  + " " + uid + " " + cgpa );
    }
    void details(){
        print();
    }
}

public class privatekeyword {

    public static void main(String[] args) {
    Students s1 = new Students();
    s1.cgpa = 12;
//    s1.uid = 233244;
    s1.cgpa = 9.3;
    s1.details();
    }
}
