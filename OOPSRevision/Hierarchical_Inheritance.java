package OOPSRevision;

class Vehicle21
{
    public  void speed(){
        System.out.println("run fast ");
    }
    public void tire(){
        System.out.println("has tires");
    }
}
class Porsche extends Vehicle21{
    public  void  Engine(){
        System.out.println("has V12 Engine");
    }

}
class Audi extends Vehicle21{

    public void Cost(){
        System.out.println("was Costly ");
    }
}
class BMW extends  Vehicle21{

    public void Adventure(){
        System.out.println("Has Adv Sector");
    }
}
public class Hierarchical_Inheritance {

    public static void main(String[] args) {
        Porsche p = new Porsche();
        System.out.println("Porsche :");
        p.speed();
        p.Engine();
        p.tire();
        System.out.println();

        Audi a = new Audi();
        System.out.println("Audi :");
        a.speed();
        a.Cost();
        a.tire();
        System.out.println();

        BMW b = new BMW();
        System.out.println("BMW :");
        b.speed();
        b.tire();
        b.Adventure();
    }

}
