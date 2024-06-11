package OOPSRevision;
class Pen
{
    //Properties and functions will be define here

    /*this :- "this" means current class OBJECT , so its clear that "this"
     only come in the picture once we intended to create an Object of
     that class. static method:- there is no need to create an object in
     order to use static method. means "instance" or object creation
     doesn't any sense with "static" as per Java rule.*/


    String Color;
    int TipSize;

    public  void setColor(String Color)
    {
        this.Color =Color;
    }
    public  void setTip(int TipSize)
    {
        this.TipSize = TipSize;
    }

}


public class ClassObjectDemo {
    public static void main(String[] args) {
        Pen p = new Pen();
        p.setColor("Red");
        System.out.println(p.Color);
        p.setColor("Blue");
        p.setTip(5);
        System.out.println(p.Color);
        System.out.println(p.TipSize);

    }

}
