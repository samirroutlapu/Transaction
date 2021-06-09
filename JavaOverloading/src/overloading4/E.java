package overloading4;

public class E {
	void m1(int a)
	{
		
		System.out.println("First method A value is "+a);
	}
	void m1(String name)
	{
		
		System.out.println("Name is " +name);
	}

	public static void main(String[] args) {
		E obj = new E();
		obj.m1(50);
		obj.m1("Samir");

	}

}
