package handling4;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomException obj = new CustomException("Error Message");
		try
		{
			throw obj;
			
		}
		catch(CustomException e)
		{
			System.out.println("CustomException "+e.getMessage());
		}
		
	}

}
