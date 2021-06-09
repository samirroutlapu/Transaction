package overloading5;

public class F {


	int m(int a) {
		return a;
	}
	
	
	
	
	
	void m(String name)
	{
		System.out.println("My name is "+name);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		F obj = new F();
		
		int n = obj.m(10);
		System.out.println("n value is "+n);
		obj.m("Samir");
	}

}
