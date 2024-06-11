package OOPSRevision;

class Student {
    String name;
    int roll;

    static String schName;

        void setName(String name){
            this.name = name;
    }
        String getName()
        {
           return this.name;
        }


    }


public class StaticDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schName="LBAV";

        Student s2 = new Student();
        System.out.println(s2.schName);

        Student s3 = new Student();
        s3.schName = "ABC";

        System.out.println(s1.schName);

    }


}
