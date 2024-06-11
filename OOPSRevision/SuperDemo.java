package OOPSRevision;

class ABC{

    ABC(){
        System.out.println("ABC constructor called");
    }
}
class PQR extends ABC{
    PQR(){
        super();
        System.out.println("PQR constructor called");
    }
}


public class SuperDemo {

    public static void main(String[] args) {
        PQR p = new PQR();

    }
}
