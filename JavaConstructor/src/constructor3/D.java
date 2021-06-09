package constructor3;

public class D {
	private D()
	{
		this(49);
		System.out.println("Private Constructor");
	}
	public D(int a)
	{
		this(10,23);
		System.out.println("public Constructor");
	}
	protected D(int a,int b) {
		System.out.println("Protected Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new D();
	}

}
