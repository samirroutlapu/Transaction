package constructor4;

public class E {
	int roll;
	String name;
	
	
	E(int roll,String name)
	{
		this.roll = roll;
		this.name = name;
	}

	public static void main(String[] args) {
		
		E obj =new E(102,"Samir");
		System.out.println("RollNo is "+obj.roll);
		
		System.out.println("Name  is "+obj.name);
		
		
		
	}

}
