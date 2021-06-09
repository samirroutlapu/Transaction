package keyword3;

public class Text3 {
	public Text3()
	{
		
		System.out.println("Default Constructor");
	}
	public Text3(int b)
	{
		this();
		System.out.println("One argument Constructor");
		
	}
	public Text3(int b,int c)
	{
		this(50);
		System.out.println("Two argument Constructor");
		
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Text3(10,20);
		
		
	}

}
