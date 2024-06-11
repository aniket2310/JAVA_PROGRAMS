package OOPSRevision;

interface  A
{
    public  void aClass();

}
interface  B
{
    public  void bClass();

}
class C implements A, B
{
    @Override
    public void aClass() {
        System.out.println("this is  class a");
    }

    @Override
    public void bClass() {
        System.out.println("this is  class b");

    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        C c = new  C();
        c.aClass();
        c.bClass();
    }



}
