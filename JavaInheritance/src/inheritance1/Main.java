package inheritance1;

public class Main {

	public static void main(String[] args) {
		A obj1 = new A();
		B obj2 = new B();
		C obj3 = new C();
		obj1.m1();
		obj1.m2();
		obj1.fun();
		
		
		obj2.m3();
		obj2.m4();
		obj2.fun();
		
		
		obj3.m5();
		obj3.m6();
		obj3.fun();
		A obj4 = new B();
		A obj5 = new C();
		obj4.fun();
		obj5.fun();

	}

}
