package JAVA_OOPS_YT;

abstract class Animal{
    String name;
    public  abstract  void makesound();

    public void sleep(){
        System.out.println(name + "Sleeping.. Zzz.. ");
    }
}
class Dog extends Animal{
    public Dog(String name){
        this.name = name;
    }
    public  void makesound(){
        System.out.println("Woof.. Woof.. Woof..");
    }
}
class Cat extends Animal{
    public Cat(String name){
        this.name = name ;
    }
    public void makesound() {
        System.out.println("Meow.. Meow.. Meow.. ");
    }
}

public class abstract_class_banking {
    public static void main(String[] args) {
        Dog d1 = new Dog("Husky");
        d1.makesound();
        d1.sleep();
        Cat c1 = new Cat("Micky");
        c1.makesound();
        c1.sleep();

    }
}
