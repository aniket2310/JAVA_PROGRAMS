
public class ExceptionHandlingDemo {

 /*     EXCEPTION HANDLING  :

  program have number of statement
    1st stmt (stmt has some logic of some particular methods)
    2nd stmt
    3rd stmt
    4 th stmt   -  if there is probleam (logical probleam)in code - program stop for execution.
    from 5th stmt there is no execution..
    -----   1000th stmt

 All the exception comes under java.lang package


 in java exception and error have different meaning
 Exception---> can be easily managable
 Error---> it is quite difficult to handle error.


 there are 2 type of Exception

 1) Checked Exception :   they are known to compiler i.e.
 they are checked at compile time
        ↓
 Example : if one file data copy to a another file if the data is copied but
 not found the another file where the data should be copied then it is checked exception.

 2) Unchecked Exception : they are the exception that are not
 checked at compile time i.e. they are checked at run time

 EXCEPTION HANDLING KEYWORDS
   To handle exception we use this,
   1) try
   2) catch
   3) finally
   4) throw
   5) throws


error shown by JVM :
Exception in thread "main" ----> error in main method
java.lang.ArithmeticException: / by zero--------->exception name
	at ExceptionHandlingDemo.main(ExceptionHandlingDemo.java:26)----->File name and line No. of code

	* Exception class is a father of all exception [means all exception can handle by Exception class.]

                             Exception
                                ↓
                            Throwable
                                ↓
     ↓ -------------------------------------------------------↓
Exception                                                    Error
    ↓---------------------------------↓                         ↓
Unchecked Exception             Checked Exception           VirtualMachineException
    ↓                               ↓                       OutOfMemoryException
ArrithmaticException             SQLException                OutOfMemoryError
NumberFormatException            IOException
IllegalArgumentException          InteruptedException
ArrayIndexOutofBoundException
NullPointerExceptionException


     */

    public static void main(String[] args) {

        int a = 0;
        int b = 4;
        try{
            int c = b/a;
            System.out.println(+c);

        }catch (Exception e){
//        e.printStackTrace();
//            System.out.println(e);

            System.out.println("catch block");
        }



    }

}
