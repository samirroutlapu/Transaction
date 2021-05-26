package javastatic3;

public class Text3 {
	static void m1() {
		System.out.println("static Method");
	
	Text3 obj = new Text3();
	obj.m2();
	//Creating object we call instance Method in Static Method 
	}
	void m2() {
		System.out.println("Nonstatic Method");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Text3.m1();
	}


}
