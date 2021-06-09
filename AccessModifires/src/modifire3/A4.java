package modifire3;

class A4 {
	private static String name ;
	private static void m1()
	{
		System.out.println("private method");
	}
	
	public static void getM1() {
		m1();
		
	}
	public static void setName(String name)
	{
		A4.name = name;
		System.out.println("My Name is "+A4.name);
	}

}
