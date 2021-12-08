package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add("ABC");
		list.add(21);
		list.add(10.45);
		list.add('d');
		
		//reading values using iterator method
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
