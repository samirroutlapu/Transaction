package interface1;

public class B implements A {
	
	
	@Override
	public void m1() {
		System.out.println("Interface Method");
		
	}

	public static void main(String[] args) {
		B obj = new B();
		obj.m1();
	
	}



}
