package exercise;
import java.util.*;
class HashSet {

	public static void main(String[] args) {
		
		//LinkedHashSet<String> hs=new LinkedHashSet<String>();
		LinkedHashSet<String> hs=new LinkedHashSet<String>();

		hs.add("apple");
		hs.add("Mango");
		hs.add("pineapple");
		hs.add("jackfruit");
		hs.add("strawberry");
		hs.add("chikku");
		hs.add("orange");
		hs.add("jackfruit");
		hs.add("papaya");
		hs.add("kiwi");
		hs.add("grape");
		System.out.println("Hashset is "+hs);
		System.out.println("Size of fruit is "+ hs.size());
		
		System.out.println("Does Hashset contains this 'orange' element  " + hs.contains("orange"));		
		System.out.println("is hashset empty  " + hs.isEmpty());
		System.out.println("remove the element "+hs.remove("Mango"));
		System.out.println("remove the element "+hs.remove("kiwi"));
		System.out.println("Size of Hashset is "+hs.size());
		System.out.println("adding fruit "+hs.add("watermeleon"));
		hs.add("banana");
		hs.add("hampe");
		System.out.println("Size of Hashset is "+hs.size());
		hs.clear();
	    System.out.println("get class  " +hs.getClass());
		
	    System.out.println("is hashset empty  " +hs.isEmpty());
	    
	}

}

	
