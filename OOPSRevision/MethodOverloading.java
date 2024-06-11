package OOPSRevision;

//Polymorphism Ability of a message to  be display in more than one form.

//Compile time Polymorphism
//Method Overloading

class Calculator
{
    public int sum(int a,int b){

        int sum = a+b;
        return sum;
    }
    public int sum(int a,int b,int c){

        int sum = a+b+c;
        return sum;
    }
    public float sum (float a,float b){
        float sum = a+b;
        return sum;
    }
}

public class MethodOverloading {

    public static void main(String[] args) {
        Calculator c  = new Calculator();
        System.out.println("Sum1 = "+c.sum(10,20));
        System.out.println("Sum2 = "+c.sum(10,20,30));
        System.out.println("Sum3 = "+c.sum(4.5f,6.4f));

    }


}
