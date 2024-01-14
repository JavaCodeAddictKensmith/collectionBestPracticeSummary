package concurrentLinkedList;

import java.util.*;
import java.util.concurrent.*;   
    
public class ConcurrentHashMapKeySetExample2 {   
    public static void main(String[] args)   
    {   
        ConcurrentHashMap<String , String>  conmap = new ConcurrentHashMap<String, String>();   
        conmap.put("A", "Java");   
        conmap.put("B", ".net");   
        conmap.put("C", "php");   
        conmap.put("D", "C");   
        conmap.put("E", "C++");   
        // print statement  
        System.out.println(" Using KeySet method : " + conmap.keySet("php"));   
        Enumeration enumr = conmap.keys();   
        System.out.println(" enumeration of keys are:");   
        while (enumr.hasMoreElements()) {   
            System.out.println(enumr.nextElement());   
        }   
    }   
}  
