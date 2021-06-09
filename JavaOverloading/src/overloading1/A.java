package overloading1;

public class A {
	
	
	void m1(int a)
	{
		System.out.println("First method");
		System.out.println("First method A value is "+a);
	}
	void m1(int a,int b)
	{
		System.out.println("Second methos");
		System.out.println("Second method A value is "+a);
		System.out.println("Second method B value is "+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj  = new A();
		obj.m1(10);
		obj.m1(30,40);
	}

}
