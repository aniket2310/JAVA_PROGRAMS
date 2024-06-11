package OOPSRevision;

//cannot create an instance of abstract class
//can have abstract and non abstract method.
//can have constructors

abstract class Vehicle // Corrected the class name
{
    abstract public void tires();  //abstract method
    abstract public void suspension();

    Vehicle(){

        System.out.println("constructor called");
    }
    public void seat(){         //concrete method
        System.out.println("has big seats");
    }
}

class BMW1 extends Vehicle{

    BMW1(){

        super();
    }
    @Override
    public void tires() {
        System.out.println("has Grip tires");
    }

    @Override
    public void suspension() {
        System.out.println("has low suspension");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {

        BMW1 b = new BMW1();
        b.seat();
        b.tires();
        b.suspension();

    }

}
