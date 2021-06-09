package collecton2;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String args[])
	{
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(101, "Sourvh");
		map.put(102, "Kunal");
		map.put(103, "Silu");
		map.put(104, "Butu");
		map.put(105, "Nitu");
		map.put(106, "Sachin");
		map.put(107, "Ramesh");
		map.put(108, "manash");
		map.put(109, "Debendra");
		map.put(111, "Bapu");
		
		
		System.out.println(map);
		
		
		System.out.println("Insert Absent elment");
		map.putIfAbsent(110,"Suman");
		System.out.println(map);
		
		
		
		System.out.println("Students id and name are:");
		for(Map.Entry m : map.entrySet())
		
		{
			
			
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
		
		System.out.println(map.isEmpty());
		
		System.out.println("Remove the specific Key");
		map.remove(101);
		System.out.println(map);
		
		
		
		System.out.println("Copy of HasMap");
		HashMap<Integer,String> mp = new HashMap<Integer,String>();
		mp.put(100,"Himesh");
		mp.putAll(map);
		System.out.println(mp);
		
		
	}

}
