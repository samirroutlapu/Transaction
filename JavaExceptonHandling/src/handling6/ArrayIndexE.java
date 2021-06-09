package handling6;



public class ArrayIndexE {

	public static void main(String[] args) {
	int arr[]= {10,38,39,31,40};
	for(int i=0;i<arr.length;i++)
{
	System.out.println(arr[i]);
}
	try
	{
	System.out.println(arr[9]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		
		System.out.println("ArrayIndexOutOfBoundsException");
	}
	

}
}