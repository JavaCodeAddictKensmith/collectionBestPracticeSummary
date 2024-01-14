package map.LinkedHashMap;

import java.util.*;
//public class LinkedHashMap<K,V> extends HashMap<K,V> implements Map<K,V>
class LinkedHashMap1{
    public class LinkedHasMap<K,V> extends HashMap<K,V> implements  Map<K,V>{};
 public static void main(String args[]){

   
  LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();  
  
  hm.put(100,"Amit");  
  hm.put(101,"Vijay");  
  hm.put(102,"Rahul");
     hm.put(104,"Rahul");

     for(Map.Entry m:hm.entrySet()){
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }  
}  