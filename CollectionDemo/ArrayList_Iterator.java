package CollectionDemo;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//Different ways of iterating an ArrayList in java
public class ArrayList_Iterator {

//    1.iteration using normal for loop.
//    2.Iteration using Iterator Object.
//    3.Iteration using ListIteratior Object.
//    4.Iteration using Ehnance for looop.

    public static void main(String[] args) {

        ArrayList <String>list = new ArrayList<String>();

        list.add("A");
        list.add("Aniket");
        list.add("Shridhar");
        list.add("Aniket");
        list.add("Bodhe");

        // 1.iteration using normal for loop.

        for (int i = 0; i < list.size(); i++) {

            System.out.print(list.get(i)+" ");
        }

        System.out.println();
        System.out.println("----------------------------------------------------");


        //    2.Iteration using Iterator Object.

        Iterator iterator = list.iterator();
        while(iterator.hasNext())
        {
            System.out.print(iterator.next()+" ");
        }

        System.out.println();
        System.out.println("----------------------------------------------------");


//    3.Iteration using ListIteratior Object.

        ListIterator listIterator1 = list.listIterator(list.size());

        while (listIterator1.hasPrevious()) {
            System.out.print(listIterator1.previous() + " ");
        }

        System.out.println();
        System.out.println("----------------------------------------------------");



        //    4.Iteration using Ehnance for looop.

            for(String s : list)
            {
                System.out.print(" "+s);

            }
    }
}
