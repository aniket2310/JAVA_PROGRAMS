package CollectionDemo;


import java.util.ArrayList;

public class Employee1 implements Comparable<Employee1> {

        private int id;
        private  String name;
        private  double salary;


        public Employee1(int id, String name, double salary) {
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

    @Override
    public int compareTo(Employee1 o) {
      if(id < o.id)
      {
          return 1;
      }
      else if (id<o.id)
      {
          return -1;
      }else
      {
          return 0;

      }
    }
}


