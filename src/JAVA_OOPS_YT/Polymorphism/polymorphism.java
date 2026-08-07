package JAVA_OOPS_YT.Polymorphism;

public class polymorphism {
    public static class Dog{
            void speak(){
                System.out.println("Bark.");
            }

    }
    public static  class Cat{
            void speak(){
                System.out.println("meow.");
            }
    }
    public static class Lion{
            void speak(){
                System.out.println("Roar");
            }
    }
    public static class human{
        void speak(){
            System.out.println("Speaker.");
        }
    }
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        Lion l = new Lion();
        human h = new human();

        d.speak();
        c.speak();
        l.speak();
        h.speak();
    }
}
