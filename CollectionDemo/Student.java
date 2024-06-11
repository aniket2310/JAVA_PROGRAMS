package CollectionDemo;

import java.util.Collection;

public class Student {

    private int id;
    private String Name;
    private String Sub;
    private int marks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSub() {
        return Sub;
    }

    public void setSub(String sub) {
        Sub = sub;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Student(int id, String name, String sub, int marks) {
        this.id = id;
        Name = name;
        Sub = sub;
        this.marks = marks;
    }
}
