package interface3;

public class G implements F {
	public void fun() {
		System.out.println("Interface Fun Method ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		F obj = new G();
		obj.m1();
		obj.fun();
	}

}
