package concurrentLinkedList;

import java.util.concurrent.*;
    
public class ConcurrentHashMapKeySetExample1 {   
    public static void main(String[] args)   
    {   
        ConcurrentHashMap<Integer, String>  conmap = new ConcurrentHashMap<Integer, String>();   
        conmap.put(10, "Java");   
        conmap.put(11, ".net");   
        conmap.put(20, "php");   
        conmap.put(12, "C");   
        conmap.put(30, "C++");   
     // print statement.  
        System.out.println(" Map : " + conmap);   
         System.out.println("keySet : " + conmap.keySet());  
    }   
}   