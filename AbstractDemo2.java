////Abstract classes and abstract methods are declared using ‘abstract‘ keyword
////We can’t create objects to those classes which are declared as abstract
////Abstract Class can be a combination of concrete and abstract methods.
////Any class extending an abstract class must implement all abstract methods. If it does not implement,
////it must be declared as abstract.
////Inside abstract class, we can keep any number of constructors. If you are not keeping any constructors,
////then compiler will keep default constructor.
////Constructors and fields can not be declared as abstract.
////Abstract methods can not be static and private.
//abstract class Employee12
//{
//    //abstract int id; // can not craete variable as abstarct
//
//    //abstract public Employee()// constructor as abstarct
//    //{
//
//    //}
//    //private static abstract void salary(); //abstarct method declartion
//    abstract void leave();
//
//    void showEmployee() // concrete method
//    {
//        System.out.println("ALL EMPLOYEES");
//    }
//
//}
//class Permant_Emp extends Employee12 // Permant employee is-a Employee
//{
//    @Override
//    void salary() //define method//implemeted method // override method
//    {
//        System.out.println("BAsic + Bonus+ HRA + JoiningBonus ");
//
//    }
//    @Override
//    void leave() {
//        System.out.println("24");
//
//    }
//
//}
//class Contract_Emp extends Employee12 // Contract employee is-a Employee
//{
//    @Override
//    void salary() {
//        System.out.println("Basic+HRA+overtime");
//
//    }
//    @Override
//    void leave() {
//        System.out.println("20");
//
//    }
//
//}
//public class AbstractDemo2 {
//    public static void main(String[] args) {
//        Employee12 emp=new Employee12();
//
//        Permant_Emp pe=new Permant_Emp();
//        pe.salary();
//        pe.showEmployee();
//
//        Contract_Emp ce=new Contract_Emp();
//        ce.salary();
//    }
//}
//
//
