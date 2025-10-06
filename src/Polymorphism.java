import java.util.Scanner;

public class Polymorphism {
    public static class lion{
        void speak(){
            System.out.println("Grrrrrrr");
        }
    }
    public static class cat{
        void speak(){
            System.out.print("meow meow");
        }
    }
    public static void main(String[] args) {
        lion l=new lion();
        cat c=new cat();
        l.speak();
        c.speak();
    }
}
