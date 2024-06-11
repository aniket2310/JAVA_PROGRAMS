import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*Hashing
Hashing is a techniquer to convert a range of key values
into a range of indexes of an array.
We're going to use modulo operator to get a range of key values. Consider an example of hash table of size 20, and the following items
are to be stored. Item are in the (key, value) format.

        key   Value
        (1  , 20)
        (2  , 70)
        (42 , 80)
        (4, , 25)
        (12 , 44)
        (14 , 32)
        (17 , 11)
        (13 , 78)
        (37 , 98)

hash table of size 20
hash table of size 20 = key % size hash Table

SrNo    Key	      Hash	            Array Index     Values

1        1	   1 % 20  = 1	            1             20
2        2	   2 % 20  = 2	            2             70
3       42	   42 % 20 = 2	            2             80
4        4	   4 %  20  = 4	            4             25
5       12	   12 % 20 = 12	            12            44
6       14	   14 % 20 = 14	            14            32
7       17	   17 % 20 = 17	            17            11
8       13	   13 % 20 = 13	            13            78
9       37	   37 % 20 = 17	            17            98

*/




public class MapDemo {

    public static void main(String[] args) {


        LinkedHashMap<String,String> map22 = new LinkedHashMap<String,String>();

        map22.put("aa","Nikhil");
        map22.put("ba","Aniket");
        map22.put("cd","Ankit");
        map22.put("df","Shri");
        map22.put("eg","Andy");
        map22.put("fg","Bodhe");
        map22.put("gw","Nikhil");

        System.out.println(map22);
        System.out.println();
        System.out.println("------------------------------------------------------------");


        //multiple key not allowed but multiple value allowed
        //null allowed as a key only for one time
        //null allowed as a value for multiple time
        //if we add 1 value for 2 time the second key and vlaue will be displayed.


        //map.add()  not use because it is not part of collection
                //Key,Value
        Map map = new HashMap();
        map.put(2,"Nikhil");
        map.put(1,"Aniket");
        map.put(5,"Ankit");
        map.put(4,"Shri");
        map.put(3,"Andy");
        map.put(6,"Bodhe");
        map.put(7,"Nikhil");

        System.out.println(map);

        System.out.println("--------------------------------------------------");
        System.out.println();

        Map map1 = new LinkedHashMap();

        map1.put(1,"Nikhil");
        map1.put(1,"Aniket");
        map1.put(5,"Ankit");
        map1.put(4,"Shri");
        map1.put(3,"Andy");
        map1.put(6,"Bodhe");
        map1.put(7,"Nikhil");
        System.out.println(map1);

        System.out.println("--------------------------------------------------");
        System.out.println();


        Map map2 = new TreeMap();

        map2.put(1,"Nikhil");
        map2.put(1,"Aniket");
        map2.put(5,"Ankit");
        map2.put(4,"Shri");
        map2.put(3,"Andy");
        map2.put(6,"Bodhe");
        map2.put(2,null);
        map2.put(7,"Nikhil");
        System.out.println(map2);
        System.out.println("--------------------------------------------------");
        System.out.println();


        HashMap <Integer,String> mm = new HashMap<>();
        mm.put(1,"Aniket");
        mm.put(1,"Nikhil");
        mm.put(5,"Ankit");
        mm.put(4,"Shri");
        mm.put(3,"Andy");
        mm.put(6,"Bodhe");
        mm.put(2,null);
        mm.put(7,"Nikhil");

        System.out.println(mm);
        System.out.println("--------------------------------------------------");
        System.out.println();


        TreeMap<Integer,Integer> tm = new TreeMap<Integer,Integer>();

        tm.put(1,23);
        tm.put(9,25);
        tm.put(5,44);
        tm.put(4,78);
        tm.put(3,26);
        tm.put(6,84);
        tm.put(7,33);

        System.out.println(tm);



    }
}
