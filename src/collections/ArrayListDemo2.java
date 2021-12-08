package collections;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to declare an arraylist with different datatype elements
		ArrayList list=new ArrayList();
		
		list.add("Smith");
		list.add("alex");
		list.add(1);
		list.add(10.2);
		list.add(123.567);
		
		System.out.println(list.size());
		
		//to read values using for loop
		// as its different datatype so we need to use Object in forloop
		
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
	}



	}


