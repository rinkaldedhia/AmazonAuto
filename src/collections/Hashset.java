package collections;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		//Different ways to declare HashSet
		
		HashSet hs=new HashSet(); //default capcity is 16 loadfactor is 0.75 by default
		//HashSet hs= new HashSet(100); //here 100 elements can be stored 
		//HashSet hs=new HashSet(100, (float) 0.90); // here we have configured the loadfactor
		//HashSet<Integer> hs=new HashSet<Integer>(); //to store a specific datatype hash set
		
		//to add objects
		hs.add("hello");
		hs.add(100);
		hs.add(10.23);
		hs.add('C');
		hs.add(true);
		hs.add(null);
		System.out.println(hs);  // here no insertion order will not be preserved and no duplicates allowed
			
		//to remove
		hs.remove(10.23);
		System.out.println( "after removing element" +hs);
		
		//to check the particular element
		System.out.println(hs.contains("hello"));
		System.out.println(hs.contains('w'));
		
		//to check hashset is empty or  not
		System.out.println(hs.isEmpty());
		
		//to read objects from hashset foreach loop or iterator method
		/*for(Object e:hs)
		{
			System.out.println(e);
		}*/
		
		//to read objects using iterator method
		Iterator i=hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
				
		
	
		
	
	
	
	}

}
