package collections;

import java.util.HashSet;

public class Hashsetdemo2 {

	public static void main(String[] args) {
		//to find union intersection and difference between hashset
		HashSet<Integer> set1=new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		System.out.println(set1);
		
		HashSet<Integer> set2=new HashSet<Integer>();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		System.out.println(set2);
		
		//to perform union --> it will find unqiue elements
		/*set1.addAll(set2);
		System.out.println("Union" +set1); // it will remove dulplicates*/
		
		//to perform intersection--> it will give common elements
		/*set1.retainAll(set2);
		System.out.println("intersection" +set1); // it will give common elements*/
		
		//to get the difference
		/*set1.removeAll(set2);
		System.out.println("difference" +set1); // it will remove the common elements*/
		
		//to get the sub set
		System.out.println(set1.containsAll(set2)); //this will give true or false
		System.out.println("subset" +set1); // it will remove duplicates and all elements
		
		
	}

}
