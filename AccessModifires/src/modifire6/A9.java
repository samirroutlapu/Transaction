package modifire6;

public class A9 {

	protected int a;
	
	protected void m1() {
		
		System.out.println("A value is "+this.a);
		
	}
	
	public void getM1()
	{
		m1();
	}
	
	public void setA(int a) {
		this.a = a;
		System.out.println("A value is "+this.a);
	}

	}

