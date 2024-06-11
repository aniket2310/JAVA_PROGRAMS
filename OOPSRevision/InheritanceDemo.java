package OOPSRevision;
//Base Class
class Animal1
{
    String Color;

    public void eat()
    {
        System.out.println("Eats");
    }
    public  void breath()
    {
        System.out.println("Breathes");
    }
}
//Derived Class
class Fish extends Animal1
{
    int fins;

    public  void swim()
    {
        System.out.println("Swims");
    }
}

public class InheritanceDemo {

    public static void main(String[] args) {

        Fish f = new Fish();
        System.out.println("Fish can ");
        f.eat();
        f.breath();
        f.swim();
        System.out.println(f.Color="Silver");
        System.out.println(f.fins=4);

    }

}
