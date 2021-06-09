package modifire2;
class A2  {
	static int a=209;
	int b;
	
	static void m1() {
		System.out.println("A value is "+A2.a);
		
	}
	void m2()
	{
		this.b = this.b+100;
		
		System.out.println("B val is "+this.b);
	}

	

}
