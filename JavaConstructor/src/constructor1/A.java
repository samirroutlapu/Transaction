package constructor1;

public class A {
	
	public A() {
		this(10);
		System.out.println("Default Constructor");
	}
	public A(int a)
	{
		this(20,30);
		System.out.println("One argument Constructor");
		
	}
	
	public A(int a,int b)
	{
		System.out.println("Two argument Constructor");
	}
	


	public static void main(String[] args) {
		new A();
		

	}

}
