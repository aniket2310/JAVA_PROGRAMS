package OOPSRevision;

class Animall{

    public  void eat(){
        System.out.println("Animal Eat anything");
    }
}
class Deer extends Animall
{
    int i=10;
    @Override
    public void eat() {
        System.out.println("Deer Eat Grass");
    }
}


public class MethodOveriding {

    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();

        Animall a = new Animall();
        a.eat();

    }


}
