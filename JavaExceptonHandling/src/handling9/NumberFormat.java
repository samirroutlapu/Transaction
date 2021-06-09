package handling9;

public class NumberFormat {

	public static void main(String[] args) {
		
		String a ="40";
		String b ="60";
		try
		{
			int x = Integer.parseInt(a);
			int y = Integer.parseInt(b);
			int z =x+y;
			System.out.println("sum = "+z);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Invalid Exception");
		}
			
		}

	}


