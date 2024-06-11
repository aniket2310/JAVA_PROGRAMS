/* The Java throws keyword is used to declare an exception.
 It gives an information to the programmer that there may occur an
  exception. So, it is better for the programmer to provide the exception
   handling code so that the normal flow of the program can be maintained.

Exception Handling is mainly used to handle the checked exceptions.
If there occurs any unchecked exception such as NullPointerException,
 it is programmers' fault that he is not checking the code before it being
  used.

  this code defines Propogation of exception   method3 call method2 ,method2 call method1
    [pass work to another] propogation .

  Throw                                                     Throws
Java throw keyword is used to                       Java throws keyword is used to declare an exception.

explicitly throw an exception.

Checked exception cannot be propagated              Throws is followed by class.
 using throw only.

Throw is followed by an instance.                   Throws is used with the method signature.

Throw is used within the method.                    You can declare multiple exceptions
                                                    e.g. public void method()throws IOException, SQLException.


You cannot throw multiple exceptions.

Checked exception can be propagated with throws.


  */


import java.io.IOException;

public class ExceptionThrows {
    void method1() throws IOException,ArithmeticException,ArrayStoreException       //these exception are classes not instance, instance will use throw
    {
        throw new IOException("Some device Error");
    }
    void method2() throws IOException
    {
            method1();
    }
    void method3() throws IOException
    {
        method2();
    }

    public static void main(String[] args) {
        ExceptionThrows et = new ExceptionThrows();
        try {
            et.method3();
        } catch (IOException e) {
            System.out.println("I can Handle it");
        }
    }
}
