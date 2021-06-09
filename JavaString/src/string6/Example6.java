package string6;

public class Example6 {

	public static void main(String[] args) {
		String s1 = new String("JAVA STRING");
		String s2 = new String("java string");
		
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		
		
		System.out.println(s1.startsWith("JAVA"));
		
		
		System.out.println(s1.endsWith("ING"));
		
		
		System.out.println(s1.compareTo(s2));
		
		
		
		System.out.println(s2.replace("a", "e"));
	}

}
