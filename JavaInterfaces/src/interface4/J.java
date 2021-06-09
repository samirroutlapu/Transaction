package interface4;

public class J implements H,I{

	

	@Override
	public void  m1() {
		// TODO Auto-generated method stub
		System.out.println("H Interface method");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("I Interface method");
	}
	
	
public static void main(String[] args) {
	
		J obj = new J();
		obj.m1();
		obj.m2();

	}

	

}
