package CollectionDemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

class Employee
{
    private int id;
    private  String name;
    private  double salary;


    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", salary=" + salary + '}';

    }
}




public class Comparable_Comparator_Demo implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getId() > o2.getId())
        {
            return 1;
        }
        else if (o1.getId()< o2.getId())
        {
            return  -1;
        }
        else
        {
            return  0;
        }

    }
}


class TestEmployeeComparator {
    public static void main(String[] args) {

        Employee emp1 = new Employee(111,"Aniket",100000);

        List<Employee> emplist = new ArrayList<Employee>();
        emplist.add(emp1);
        emplist.add(new Employee(141,"ada",41116261));
        emplist.add(new Employee(11,"a",41116261));
        emplist.add(new Employee(17,"aaaa",41116261));
        emplist.add(new Employee(1,"aaca",41116261));
        emplist.add(new Employee(151,"aasda",41116261));

        EmployeeNameCompartor enc = new EmployeeNameCompartor();

        System.out.println(emplist);

    }

        }