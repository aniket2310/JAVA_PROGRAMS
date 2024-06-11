package OOPSRevision;

class Student1
{
    String Name;
    int Roll;
    int Password;

    Student1(String Name , int Roll)
    {
                this.Name = Name;
                this.Roll = Roll;
        System.out.println("Name = "+Name+", RollNo = "+Roll);


    }
    Student1(Student1 s1)
    {
        //this is a copy constructor

    }
}

public class CopyConstructorDemo {

    public static void main(String[] args) {
        Student1 s1 = new Student1("ABC",100);
        s1.Password = 123;
        System.out.println(s1.Password);
        Student1 s2 = new Student1("Pqr",200);
        s2.Password = 23456;
        System.out.println(s2.Password);

    }
}
