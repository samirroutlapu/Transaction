package polymorphism;

public class Child extends Parent {
	
	void m1()
	{
		this.n = this.n+10;
		System.out.println("Child......M1");
		
		System.out.println("N value is "+this.n);
	}
	

	public static void main(String[] args) {
		
		
		Parent o = new Child();//Upcasting
		o.m1();
		

		
	}

}
