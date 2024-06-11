package CollectionDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;



public class SetDemo {

    public static void main(String[] args) {

        Set set= new HashSet();
        /*
duplicate value not allowed
not a single null value not allowed
in sorted oreder
 */

        set.add(5);
        set.add(2);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(3);
        set.add(1);
        set.add(null);
        set.add(null);
        set.add(8);

        System.out.println("Hash Set "+set);

        System.out.println("------------------------------------------");
        System.out.println();




        Set set2 = new TreeSet();

        /*
duplicate value not allowed
not a single null value not allowed
in sorted oreder
 */

        set2.add(5);
        set2.add(2);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(3);
        set2.add(1);
        set2.add(8);

        System.out.println("Tree set "+set2);

        System.out.println("------------------------------------------");
        System.out.println();

        Set set1 = new LinkedHashSet();

        /*
duplicate value not allowed
not a single null value not allowed
not in sorted oreder
 */

        set1.add(5);
        set1.add(2);
        set1.add(4);
        set1.add(5);
        set1.add(6);
        set1.add(null);
        set1.add(null);
        set1.add(3);
        set1.add(1);
        set1.add(8);

        System.out.println("Linked Hash Set "+set1);

        System.out.println("------------------------------------------");
        System.out.println();

    }
}
