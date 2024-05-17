package africa.semicolon.Collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {

    public static void main(String[] args) {
//        Comparable<String> comparator = (a,b)->b.compare(a);
        Map<String, Integer> map = new Hashtable<>();
        map.put("ONE",1);
        map.put("TWO",2);
        map.put("THREE",3);
        map.put("FOUR",4);
        map.put("FIVE",5);
        System.out.println(map);


    }
}
