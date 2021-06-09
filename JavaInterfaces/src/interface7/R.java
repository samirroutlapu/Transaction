package interface7;

public class R implements Q{
	public static void main(String args[])
	{
		Q obj = new R();
		obj.m1();
		obj.m2();
		
		
	}

	@Override
	public void m1() {
		System.out.println("P Interface Method");
		
		
		
	}

	@Override
	public void m2() {
		System.out.println("Q Interface Method");
		
	}

}
