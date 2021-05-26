package javastatic1;

public class Text1 {

	static int a = 10;
	static int b = 20;
	int s;
	int r;
	static void m1() {
		System.out.println("a val is " + Text1.a);
	}
	static void m2() {
		System.out.println("b val is " + Text1.b);
	}
	void n1() {
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   this.s= 30;
		System.out.println("s val is " + this.s);
	}
	void n2() {
		this.r= 40;
		System.out.println("s val is " + this.r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Text1.m1();
		Text1.m2();
		Text1 obj = new Text1();
		obj.n1();
		obj.n2();
	}


}
