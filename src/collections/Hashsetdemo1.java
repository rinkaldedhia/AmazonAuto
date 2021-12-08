package collections;

import java.util.HashSet;

public class Hashsetdemo1 {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(100);
		hs.add(56);
		hs.add(67);
		System.out.println(hs);
		
		//creating another hashset
		HashSet <Integer>numbers=new HashSet<Integer>();
		//if we want to add all numbers from the hs hashset
		numbers.addAll(hs);
		numbers.add(10);
		System.out.println(numbers);
		
		//if we want to remove all
		numbers.removeAll(hs);
		System.out.println(numbers);

	}

}
