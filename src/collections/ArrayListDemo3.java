package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add("A");
		list.add("H");
		list.add("P");
		list.add("G");
		list.add("S");
		
		// CREATE A DUPLICATE ARRAY LIST 
		ArrayList list1=new ArrayList();
		list1.addAll(list); // this will copy all the elements
		System.out.println(list1);
		
		list1.removeAll(list); // this will remove all the elements
		System.out.println("after removing" +list1);
		
		// to sort elements
		System.out.println("Before Sorting" +list);
		Collections.sort(list);
		System.out.println("After Sorting" +list);
		
		// to sort in reverse order
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("After sorting in reverse order" +list);
		
		//to shuffle
		Collections.shuffle(list);
		System.out.println("After Shuffling" +list);

	}

}
