package OOPSRevision;
/*
Constructor is a Special type of method which is invoked automatically at the time of object Creation

Constructor have the same name as class
Constructor dont have any return type not even [void].
constructor are called once, at the time of object creation
memory allocation happens when constructor is called.

 */

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

class Student12
{
    String Name;
    int Roll;

    Student12()
    {
        System.out.println("Constructor is called ");
    }
    Student12(String Name,int Roll)
    {
        this.Name = Name;
        this.Roll = Roll;
        System.out.println(Name+","+Roll);
    }
    Student12(String Name)
    {
        this.Name = Name;
        System.out.println(Name);
    }
}

public class Default_Parameterized_constructorDemo {
    public static void main(String[] args) {
        Student12 s1 = new Student12();
        Student12 s2 = new Student12("Aniket",15);
        Student12 s3 = new Student12("Andy");
    }

}
