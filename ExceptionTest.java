//my exception is-A Exception
class MyException extends Exception
{
    private int ex;
    MyException(int a)
    {
        ex = a;

   }
   public String toString(){
        return "My Exception ["+ ex +"] is less than 0";
   }
}
public class ExceptionTest {
    static  void sum (int a, int b)throws MyException
    {
        if(a<0){
            throw  new MyException(a);
        }
        else {
            System.out.println(a+b);
        }
    }
    public static void main(String[] args) {
        try {
          //  sum(-10, 10);   //occurs custom exception
            sum(10,10);
        }catch (MyException e){
          e.printStackTrace();
        }
    }
}
