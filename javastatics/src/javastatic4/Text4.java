package javastatic4;

public class Text4 {
	static void m1() {
		System.out.println("static Method");
	 
	}
	void m2() {
		System.out.println("Nonstatic Method");
		Text4.m1();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Text4 obj = new Text4();
		obj.m2();
	}


}
