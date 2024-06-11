/*
Marker Interface : Empty Interface

It provide Information about an Object's runtime type

Examples : Clonable, Serializable, Remote Interface;

 */

import javax.imageio.stream.ImageInputStream;
import java.io.FileOutputStream;

public class MarkerInterfaceDemo {

    int id;
    String name;
    int marks;

    public  MarkerInterfaceDemo(int id,String name,int marks){

        this.id = id;
        this.name = name;
        this.marks = marks;

    }

    public static void main(String[] args) {
        MarkerInterfaceDemo mi = new MarkerInterfaceDemo(1,"Aniket",90);
    }
}
