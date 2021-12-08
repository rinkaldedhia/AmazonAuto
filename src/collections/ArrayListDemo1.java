package collections;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
	// how to declare a specific datatype arraylist
	ArrayList<String> list=new ArrayList<String>();      //string arraylist
					
	// how to add values to arraylist
	list.add("Smith");
	list.add("John");
	list.add("Alex");
	list.add("Mary");
					
	// to get the size of arraylist
		System.out.println(list.size());
					
	//to read the values in the arraylist using for each loop
		for(String s:list) // here we using String  but if multiple data type are there we should use Object
			{
			System.out.println(s);	
			}
					
	// to insert a new element in the middle of arraylist
			list.add(1, "Anni");                               //using index number
			System.out.println("the elements after inserting a new element are" +list);
					
	// to remove any element in the middle of arraylist
			list.remove(3);
			System.out.println("the elements after removing an element are" +list);

	// to retrieve/ to extract any element
			System.out.println(list.get(1));

	// to replace any element
			System.out.println(list.set(2,"selenium"));
					
	// to search any element --> returns boolean value
			System.out.println(list.contains("Smith"));
					
	// to check arraylist is empty --> returns boolean value
			System.out.println(list.isEmpty());
					
				}
			}

	


