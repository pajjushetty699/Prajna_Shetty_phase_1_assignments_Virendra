package exercise;
import java.util.*;

public class HashMap {

	public static void main(String[] args) {
		//Map<Integer,String> hm=new Map<Integer,String>();
	    Map<Integer, String>LinkedHashMap = new LinkedHashMap<Integer, String>();
         LinkedHashMap.put(1,"Apple");
         LinkedHashMap.put(2,"Grape");
         LinkedHashMap.put(3,"orange");
         LinkedHashMap.put(4,"Banana");
         LinkedHashMap.put(5,"Jackfruit");
         LinkedHashMap.put(6,"Pineappla");
         LinkedHashMap.put(7,"Pappaya");
         LinkedHashMap.put(8,"kiwi");
         LinkedHashMap.put(9,"perl");
         System.out.println("Contents of LinkedHashMap : " + LinkedHashMap);


         for(Integer key: LinkedHashMap.keySet()){
 			System.out.println(key  +" : "+ LinkedHashMap.get(key));
         }
 	        System.out.println("\nLinked hashMap remove the Fruit " + LinkedHashMap.remove(4));
 	        System.out.println("\nLinked hashMap remove the Fruit " + LinkedHashMap.remove(7)); 	        
 	        System.out.println("\nLinked hashMap contains Fruit " + LinkedHashMap.containsKey(4));
 	        System.out.println("\nLinked hashMap contains Fruit " + LinkedHashMap.containsValue("Banana"));
 	        System.out.println("\nLinked hashMap contains Fruit " + LinkedHashMap.containsValue("Apple"));
 			System.out.println("hascode"+ LinkedHashMap.hashCode());

 	       LinkedHashMap.clear();
 	        System.out.println("\nContent of LinkedHashMap after clearing: " + LinkedHashMap);
 	 

         }
		
	}


