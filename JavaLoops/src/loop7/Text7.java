package loop7;

public class Text7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =153;
		int t = n ,r;
		int sum = 0;
	
		while(t>0)
		{
			r = t%10;
			sum = sum+(r*r*r);
			t = t/10;
			}
	if(n==sum)
	{
		System.out.println(n+" Number is amstrong ");
	}
	else
	{
		System.out.println(n+" Number is not amstrong ");
	}
		

	}

}
