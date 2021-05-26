package javastatic2;

public class Text2 {
	static int d = 30;
	int a;
	static void m1() {
		System.out.println("instance variables dose not exit in static method");
		//thhis.a = 50----->Does not exist.
	}
	void m2() {
		System.out.println("static variables does not exit in nonstatic  method");
		
	}
	

	public static void main(String[] args) {
		Text2.m1();
		Text2 obj = new Text2();
		obj.m2();
		// TODO Auto-generated method stub

	}

}



