package loop9;

public class Text9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1221,r,d,sum=0;
		int t=n;
		while(n>0)
		{
			r=n%10;
			sum = sum*10+r;
			n=n/10;
		}
		if(sum==t)
		{
			System.out.println("palindram no");
		}
		else
		{
			System.out.println("not palindram no");
		}
		
	}

}
