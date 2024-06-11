package CollectionDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo2 {
    public static void main(String[] args) {

        LinkedList list = new LinkedList<>();

        list.add("Aniket");
        list.add("Shridhar");
        list.add(null);
        list.addFirst("Aaaaa");
        list.addLast("ZZZZ");

        System.out.println(list.remove(null));

        System.out.println(list.set(2,"GGG"));

        System.out.println(list.isEmpty());

        System.out.println(list);


        LinkedList list2 = new LinkedList<>();

        list2.addAll(list);

        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i)+",");
        }

        System.out.println();

        System.out.println(list2);


        Iterator iterator = list.iterator();
        while(iterator.hasNext())
        {
            System.out.print(iterator.next()+" ");
        }

        System.out.println();

        ListIterator listIterator1 = list.listIterator(list.size());

        while (listIterator1.hasPrevious()) {
            System.out.print(listIterator1.previous() + " ");
        }

        System.out.println();

    }

}
