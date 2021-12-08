package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EntryMethodsExample {

	public static void main(String[] args) {
		HashMap <Integer, String> hm=new HashMap<Integer, String>();
		hm.put(101, "david");
		hm.put(102, "sonu");
		hm.put(103, "mary");
		hm.put(104, "anu");
		hm.put(105, "alex");
		System.out.println(hm);
		
		//to read all the entries as a set we have to use entry set method
		System.out.println(hm.entrySet()); // this will give as a entryset object
		
		//to read here Map.Entry is a variable type, entry is reference variable
		for(Map.Entry entry:hm.entrySet())
		{
			System.out.println(entry.getKey() +"   "+entry.getValue());
		}
		
		//to read each entry seperatelyby iterator method
		Set s=hm.entrySet();
		Iterator itr= s.iterator();
		while(itr.hasNext())
		{
			Map.Entry e= (Entry) itr.next(); //here adding cast to entry
			System.out.println(e.getKey()+"      " +e.getValue());
		}
		
	}

}
