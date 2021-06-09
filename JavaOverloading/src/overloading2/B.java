package overloading2;

public class B {
	
	void m1(int a)
	{
		System.out.println("A value is "+a);
	}
	void m1(double salary ,String name)
	{
		
		System.out.println("Name is "+name);
		System.out.println("Salary is "+salary);
	}
	
	

	public static void main(String[] args) {
		
		B obj = new B();
		obj.m1(20);
		obj.m1(30000 ,"Samir");

	}

}
