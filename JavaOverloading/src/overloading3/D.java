package overloading3;

public class D extends C{

	
	void m1(int a)
	{
		System.out.println("D clasls method");//Override
	}

	
	public static void main(String[] args) {
		D obj = new D();
		obj.m1(10);
		C obj1 = new C();
		obj1.m1(20);
	}

}
