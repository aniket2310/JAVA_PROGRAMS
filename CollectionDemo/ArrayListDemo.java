package CollectionDemo;

//Array list use dynamic object to store the data

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

List<String> list = new ArrayList<String>();
list.add("Aniket");
list.add("Shridhar");
list.add("Bodhe");
list.add("Nikhil");
//list.add(true);   it will get because it is restricted for String type of data.
//list.add(21);      it will get because it is restricted for String type of data.

list.add(4,"Andy");

        System.out.println(list);


        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);
        list2.add(2,60);
      //  list2.removeAll(list2);  // remove all elements  of list2 and list3;
        System.out.println(list2);


        List<Integer> list3 = new ArrayList<Integer>();
        list3.addAll(list2);
        System.out.println( list3.contains(10));
        System.out.println(list3);



    }
}
