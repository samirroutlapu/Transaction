package loop8;

public class Text8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =7;
		int count =0;
		for(int i = 1;i<= n;i++)
		{
			if(n/i==0)
			{
				count++;
			}
		
		}
		if(count==2)
		{
			System.out.println(n+ " is Prime Number");
		}
		else
		{
			System.out.println(n+ " is not Prime Number");
		}

	}

}
