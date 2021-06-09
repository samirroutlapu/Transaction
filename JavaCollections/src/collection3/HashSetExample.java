package collection3;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		set.add("Six");
		set.add("Seven");
		set.add("Eight");
		set.add("Nine");
		set.add("Ten");

		
		
		
		System.out.println(set);
		
		System.out.println("Iterable object");
		
		Iterator itr = set.iterator(); 
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		System.out.println("Hashset size " +set.size());
		
		System.out.println("Remove the elements");
		set.remove("One");
		System.out.println(set);
		
	}

}
