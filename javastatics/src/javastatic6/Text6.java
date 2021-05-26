package javastatic6;

public class Text6 {
	static void fun1() {
		System.out.println("static method");

	}
	void fun2() {
		System.out.println("instance method");
	}

	public static void main(String[] args) {
		Text6.fun1();
		Text6 obj = new Text6();
		obj.fun2();

	}

}
