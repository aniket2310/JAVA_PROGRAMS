package OOPSRevision;

public class StaticDemo2 {
  static int a = 0;

   public void inc (){
       a = a+1;
       System.out.println(a);
   }

    public static void main(String[] args) {

        StaticDemo2 sd = new StaticDemo2();
        sd.inc();
        StaticDemo2 sd1 = new StaticDemo2();
        sd1.inc();
        StaticDemo2 sd2= new StaticDemo2();
        sd2.inc();
    }
}
