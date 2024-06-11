package CollectionDemo;

import java.util.LinkedList;

//Duplication can done.
//Insertion order preserved
//accept 1 or more null values
//accept any tipe od data

/*insertion and deletion in the linkedList is easy but when we have to
find(retrival of data) the data in linked list is difficiult to fetch.

Use by Linkedlist to store the data -node -
                     firt section - previous section- data address
                     middle section -data
                     last section -last data address


stack -LIFO


 */


/*

 */




public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.add(2);
        list.add(2);
        list.add("A");
        list.add("Aniket");
        list.add("Shridhar");
        list.add(null);
        list.add(null);
        list.add("Aniket");
        list.add("Bodhe");

        System.out.println(list);

        System.out.println(list.contains(5)); //contains true else false

        System.out.println( list.indexOf("A"));     //contains index of A

        System.out.println(list.getFirst());  //get the first index

        System.out.println(list.getLast()); //get the last index


        System.out.println();

        LinkedList <String> list1 = new LinkedList<String>();
      //  list1.add(2);
        list1.add("ABC");
        list1.add("Andy");
        list1.add("S");
        list1.add("Ani");
        list1.add("Bodhe");

        System.out.println(list1);


        System.out.println(list1.contains(5)); //contains true else false

        System.out.println( list1.indexOf("A"));     //contains index of A

        System.out.println(list1.getFirst());  //get the first index

        System.out.println(list1.getLast()); //get the last index

        System.out.println(list1.peekFirst());

    }
}
