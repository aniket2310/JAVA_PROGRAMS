//
//class Employee {    //when you use getter and setter then you can access private data members called Eancapsulation
//                    //POJO --> Plain Old Java Object
//
//    //static Polymorphism ---> Dynamic Polymorphism
//
//    //early  Binding                 // late binding
//    //compile time                   // run time
//    //constructor overloading        //constructor Overriding---no such concept
//    //method overloading             //method Overriding
//
//
//       private String name;
//        private String role;
//
//       public Employee(){   //POJO class    //default Constructor
//
//        }
//    public Employee(String name, String role) {
//        this.name = name;       //NAME POINT TO PARAMERER LIST NAME
//        this.role = role;       //ROLE POINT TO PARAMETER LIST ROLE
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getRole() {
//        return role;
//    }
//
//    public void setRole(String role) {
//        this.role = role;
//    }
//
//    public double calculateSalary() {
//
//           return 0.0;
//
//    }
//
//
//}
//
//class Manager extends Employee{
//
//    private  double baseSalary;
//    private double bonus;
//    private double overtimePay;
//
//    public Manager(double baseSalary, double bonus) {
//        this.baseSalary = baseSalary;
//        this.bonus = bonus;
//    }
//    public Programmer(double baseSalary,double overtimePay) {
//        this.baseSalary = baseSalary;
//        this.bonus = bonus;
//        this.overtimePay =overtimePay;
//    }
//
//    public double calculateSalary() {
//        return baseSalary+bonus;
//    }
//    public Manager( double baseSalary, double bonus) {
//        super(name, role);
//        this.baseSalary = baseSalary;
//        this.bonus = bonus;
//    }
//
//    public Programmer(String name, String role, double baseSalary,double overtimePay) {
//        super(name, role);
//        this.baseSalary = baseSalary;
//        this.bonus = bonus;
//        this.overtimePay=overtimePay;
//    }
//
//}
//
//
//
//    public  class EmpMain{
//    public static void main(String[] args) {
//        Employee emp = new Employee();
//        Employee emp1 = new Manager(75.00,45.01);
//
//
//        emp.setName("ANU");
//        System.out.println(emp.getName());
//
//        emp.setRole("Developer");
//        System.out.println(emp.getRole());
//
//
//
//
//
//    }
//}















/*OOPs
        Class
Object
        Encapsulation =wrapping of data(Data member)accsess modifier into a single unit(Class)
getter setter method
Data abstraction- abstract
Inheritance - is- a (extends)  has- a (by reference varible)
Polymorphism
class same                      class some
{                               {
    add(int)                    add(int)
    add(int int)                add(int)
    add(int float)              }
    add(float int)              class ABC
{
    add(int)
}                                }
//Polymorphism-
/*Static polymorphism       Dynamic Polymorphism
compile-time              Runtime-polymorphism
early binding             Late Binding
u can achive in java
using
method overloading         Method Overriding
constructor overloading    Constructor Overriding -no such concept*/
//Encapsualation
//POJO- Plain Old Java Object
//Entity
//bean   */

class Employee
{
    private String name;
    private String role;
    public Employee() {
        super();

    }

    public Employee(String name, String role) {
        super();
        this.name = name;
        this.role = role;
    }
    public double calculateSalary()
    {
        return 0.0;

    }

}
class Manager extends Employee
{

    private double baseSalary;
    private double bonus;


    public Manager(double baseSalary, double bonus) {
        super();
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }
    @Override
    public double calculateSalary()
    {
        return baseSalary + bonus;

    }

}
class Programmer extends Employee
{
    private double baseSalary;
    private double overTimePay;

    public Programmer(double baseSalary, double overTimePay) {
        super();
        this.baseSalary = baseSalary;
        this.overTimePay = overTimePay;
    }
    public double calculateSalary()
    {
        return baseSalary + overTimePay;

    }

}
public class EmpMain {
    public static void main(String[] args) {

        Employee emp=new Manager(75566.5,747575.4);
        emp.calculateSalary();
        Employee emp1=new Programmer(34555, 34555);
        emp1.calculateSalary();


    }
}

