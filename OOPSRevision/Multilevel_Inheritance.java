package OOPSRevision;

class Animal2
{
    public void eat(){
        System.out.println("he can eat");
    }
    public  void breath(){
        System.out.println("he can breathe");
    }
}
class Mammal extends Animal2{
    public void legs(){
        System.out.println("has legs");

    }
    public  void fins(){
        System.out.println("has fins");
    }
}
class Human extends Mammal{
    public void hands(){
        System.out.println("has Hands");
    }

}

public class Multilevel_Inheritance {

    public static void main(String[] args) {
        Human h = new Human();
        System.out.println("Human :");
        h.eat();
        h.breath();
        h.hands();
        h.legs();
        System.out.println();
        Mammal m = new Mammal();
        System.out.println("Whale :");
        m.eat();
        m.breath();
        m.fins();

    }
}
