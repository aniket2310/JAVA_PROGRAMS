package OOPSRevision;
/*
Encapsulation in Java refers to integrating data (variables)
and code (methods) into a single unit. In encapsulation,
a class's variables are hidden from other classes and can
 only be accessed by the methods of the class in which
 they are found.[Data Hiding Using Access Specifiers]


POJO - PLAIN OLD JAVA OBJECT
THIS CLSS ALSO CALLED AS BEAN ENTITY

 */



 class Animal
{
   private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
}
class  EancapsulationDemo
{
    public static void main(String[] args) {
        Animal a = new Animal();
        a.setName("Lion");
        System.out.println(a.getName());
    }

}