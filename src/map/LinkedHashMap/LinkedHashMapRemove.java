package map.LinkedHashMap;

import java.util.*;

public class LinkedHashMapRemove {
    public static void main(String args[]) {
        Map<Integer,String> map=new LinkedHashMap<Integer,String>();
        map.put(101,"Amit");
        map.put(102,"Vijay");
        map.put(103,"Rahul");
        System.out.println("Before invoking remove() method: "+map);
        map.remove(102);
        System.out.println("After invoking remove() method: "+map);
        map.put(102,"Vijay");
        map.remove(101,"Amit");

        System.out.println("After invoking2 remove() method: "+map);
    }
}
