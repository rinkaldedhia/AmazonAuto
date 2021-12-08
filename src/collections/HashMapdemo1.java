package collections;

import java.util.HashMap;

public class HashMapdemo1 {

	public static void main(String[] args) {
	HashMap hm=new HashMap();
	//HashMap<Integer, String> hm=new HashMap<Integer, String>();
	
	//to add some key and values to HashMap
	hm.put(101, "john");
	hm.put(102, "david");
	hm.put(103, "mary");
	System.out.println(hm);
	
	hm.put(103, "xyz");
	System.out.println(hm);  // here duplicates keys are not allowed, but it will set new value
	
	//to get value
	System.out.println(hm.get(102));
	
	//to remove
	hm.remove(103);
	System.out.println(hm);
	
	//to check key
	System.out.println(hm.containsKey(102));
	System.out.println(hm.containsKey(105));
	
	//to check value
	System.out.println(hm.containsValue("david"));
	
	//to check hashmap
	System.out.println(hm.isEmpty());
	
	//to get only keys from hashmap --> this will return in Set object
	System.out.println(hm.keySet());
	
	//to get only values from hashmap --> this will return the collection object
	System.out.println(hm.values());
	
	//to get the entryset --> this will return entries in set object
	System.out.println(hm.entrySet());
	
	

	}

}
