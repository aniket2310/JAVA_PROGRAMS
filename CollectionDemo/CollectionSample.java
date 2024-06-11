package CollectionDemo;

/*

BookShelve : arreanging the book and accessing it easily.
one object bookshelve having ---> the multiple object books.


Array : normal array are of fixed length
you cannot change the size of array once they are defined.
you must know in advance how large an array you want

Collection you may not know how large an array you want.
To overcome this situation, Collection framework. (Array List)


Collections are nothing but group of objects stored in well defined manner. Earlier, Arrays are used to represent these group of objects.
But, arrays are not re-sizable. size of the arrays are fixed. Size of the arrays can not be changed once they are defined. This causes lots
 of problem while handling group of objects. To overcome this drawback of arrays, Collection framework.

jdk 1.2 [Dictionary, Vector, Stack, Properites]--> these are the legacy or old classes but they are not much in use.


jdk 1.5  --> major modification is done in this java

                                OBJECT CLASS
                                   ↓
                             Iterable(Interface)
                                    ↓
                            Collection(Interface)
                                    ↓
            -----------------------------------------------------
            ↓                      ↓                             ↓
        List(I)                 Queue(I)                        Set(I)
           ↓                        ↓                              ↓
        ArrayList (C)            De-Queue                    Hashset (C)
        LinkedList (C)           Priority Queue              Linked Hash Set (C)
        Vector (C)               LinkedList (C)                  Sorted set (C)
        Stack (C)                                                Tree set (C)
                                                                 Navigable set (C)

                                Map
                                 ↓
    ----------------------------------------------------------------------------
    ↓                         ↓                         ↓                      ↓
Hash Map                WeakHash Map            Identity HashMap            Sorted Map
  ↓
Linked Hash Map



Application Programming Interface [API]: Collection of multiple interface and methods.
Organize the data into different Format / retrive the data / modify the data.

ARRAYLIST:


        // list.add(10);----> add method is a overloaded method
        //you can put any type of data in the array list.
        //insertion order perserved.
        //duplication of data is possible
        //it will except the null values and multiple null values too
        //arrayList use dynamic array to store the data.
        //retrival of data is easy instead of insertion and deletion of the data in the array list.
        //in the arraylist elements are positioned according to zerobased index
        //initial capacity for array list is 10
        //after 10 it will incrrease if data get added.


    arrayList    [10, A, Aniket, Shridhar, Aniket, Bodhe, null, null, null, 2.4, true]

      Index       0    1    2       3        4       5      6     7     8     9    10
 */


import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class CollectionSample
{

    /*
    interface Collection extends iterable
    {
        int size();
        isempty();
        contains();
        iterable();
        toArray();
        add();
        addAll();
        remove();
        removeAll();
    And many more methods are there

    }
    interface List extends collection interface Set extends Collection
    {
        int size();
        isempty();
        contains();
        iterable();
        toArray();
        add();
        addAll();
        remove();
        removeAll();
    And many more methods are there of Collection

    and also have some another methpod of Sst
    }
    interface Clonable
    {
    }
    interface Serializable
    {
    }
    interface Serializable
    {
    }
    ArrayList implements List ,Clonable,Serializable,Serializable  extend AbstractList


MAP :
HashMap, LinkedHashMap And TreeMap


Internal Structure :

HashMap: It internally uses an array of buckets where each bucket internally uses linked list to hold the elements.
LinkedHashMap: Same as HashMap but it additionally uses a doubly linked list to maintain insertion order of elements.
TreeMap: It internally uses Red-Black tree.



Null Elements :
HashMap: Only one null key and
can have multiple null values

LinkedHashMap Only one null key
and can have multiple null values.

TreeMap: Doesn't allow even a
single null key but can have
multiple null values.

Duplicate Elements :

HashMap: Does not allow duplicate keys but can have duplicate values.

LinkedHashMap: Does not allow duplicate keys but can have duplicate values.

TreeMap: Does not allow duplicate keys but can have duplicate values.


Order Of Elements :

HashMap: No Order

LinkedHashMap: Insertion Order

TreeMap: Elements are placed
according to supplied Comparator
or in natural order of keys if no
Comparator is supplied.

When to use?

HashMap: Use it if you want only
key-value pairs without any order.

LinkedHashMap: Use it if you
want key-value pairs in insertion
order.

TreeMap: Use it when you want
key-value pairs sorted in some
specific order.


*/
    public static void main(String[] args) {

        ArrayList list = new ArrayList();


        list.add(10);
        list.add("A");
        list.add("Aniket");
        list.add("Shridhar");
        list.add("Aniket");
        list.add("Bodhe");
        list.add(null);
        list.add(null);
        list.add(null);
        list.add(2.4);
        list.add(true);
        list.remove(3);

        System.out.println(list);

        System.out.println(list.get(5));

        list.add(false);

        System.out.println(list);

    }
}