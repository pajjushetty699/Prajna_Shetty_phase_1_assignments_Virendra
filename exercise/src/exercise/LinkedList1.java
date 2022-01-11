package exercise;
import java.util.*;

public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList<String> ls=new LinkedList<String>();
		ls.add("May");
		ls.add("June");
		ls.add("July");
		ls.add("August");
		ls.add(0,"April");
		ls.add("November");
		ls.addFirst("January");
		ls.addLast("December");
		ls.add(1,"March");
		ls.add(1,"Febuary");
		ls.add(8,"Septmeber");
		ls.add(9,"October");
		Iterator itr=ls.iterator();
        while(itr.hasNext()) {
        System.out.println("list is"+ itr.next());
        }
       
		System.out.println("size of linked list: "+ls.size());
		System.out.println("linked list contains 'winter month'? "+ls.contains("December"));

	
	 
    Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
    
    linkedHashMap.put(8, new String("Septmeber"));
    System.out.println("remove the 'Birthday Month': "+linkedHashMap.remove(8,"Septmeber"));
    System.out.println(ls);
	}

}
