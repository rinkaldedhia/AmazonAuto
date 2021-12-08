package collections;

import java.util.HashMap;

public class HashMapdemo2 {

	public static void main(String[] args) {
	HashMap <Integer, String> hm=new HashMap<Integer, String>();
	hm.put(101, "david");
	hm.put(102, "sonu");
	hm.put(103, "mary");
	hm.put(104, "anu");
	hm.put(105, "alex");
	
	// to read the keys as set
	System.out.println(hm.keySet());
	
	//to read all individual keys
	for(Object e:hm.keySet())
			{
				System.out.println(e);
			}
	//to read all the values as collections
	System.out.println(hm.values());
	
	//to read individual values
	for(Object i: hm.values())
	{
		System.out.println();
	}
	
	//to read key and values individually together
	for(Object s:hm.keySet())  // here all the keyset will one by one stored in s
	{
		System.out.println(s+"    " +hm.get(s));  //hm.get(s) will retrieve the individual value
	}
	}

}
