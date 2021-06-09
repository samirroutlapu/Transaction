package interface5;

public class M implements K,L {
	public void fun() {
		System.out.println(" Same Method in two interface");
	}

	public static void main(String[] args) {
		
		
		M obj = new M();
		obj.fun();
		

	}

}
