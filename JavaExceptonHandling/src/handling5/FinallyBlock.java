package handling5;

public class FinallyBlock {

	public static void main(String[] args) {
		
		
		try
		{
		int a = 100/0;
	
		}catch(Exception e)
		{
			System.out.println("AirthmeticException");
		}
		finally
		{
			System.out.println("Finally Block");
		}
	
	}

}
