package modifire1;

public class A1 {
	
	
	private int n;
	
	
	private void fun(){
		
		this.n = this.n+33;
		
		System.out.println("N value is "+this.n);
		
	}
	
	
	
		public static void main(String[] args) {
			
		A1 obj = new A1();
		obj.fun();
			
		}
}


