package constructor2;

public class C extends B {
	C(int a,int b)
	{
		super(a);
		System.out.println("Sub class one argument constructor");
	}

	public static void main(String[] args) {
		new B();
		new C(10,29);
		
		

	}

}
