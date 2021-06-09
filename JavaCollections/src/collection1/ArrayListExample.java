package collection1;

import java.util.ArrayList;

import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<String>();
	
	
	list.add("Sourav");
	list.add("sumit");
	list.add("Manoj");
	list.add("Ritik");
	list.add("sasmita");
	list.add("Aman");
	list.add("suman");
	list.add("linkan");
	list.add("likun");
	list.add("manash");

	
	System.out.println(list);
	
	System.out.println("Using iterator obj ");
	
	
	
	Iterator itr = list.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	
	System.out.println("Adding elements in specific index");
	list.set(1,"Hemant");
	System.out.println(list);
	System.out.println("Remove an element from the Arraylist");
	
	
	list.remove(1);
	list.remove("Ritik");
	System.out.println(list);
	
	
	
	System.out.println("Update an elements in pafrticular Index");
	list.add(1,"Samir");
	System.out.println(list);
	
	
	System.out.println("Get an element at particular index");
	System.out.println(list.get(1));
	System.out.println(list);
	
	
	
	System.out.println("Size of the Arraylisr "+list.size());
	
	
	
	
	System.out.println("Given elements present or not");
	
	if(list.containsAll(list))
	{
	System.out.println("Elements are present");
	}
	else
	{
		System.out.println("NO Elements");
	}
	
	
	
	
	System.out.println("Remove all elements");
	list.removeAll(list);
	System.out.println(list);
	
	
	
	
	}

}
