package stream3;


import java.io.FileReader;

public class FileReaderExample {
	
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("F:\\nit.txt");
			int data;
			while((data=fr.read()) != -1)
			{
				System.out.print((char)data);
			}
			
			
		} catch (Exception e) {
			System.out.println("Error");
		
		
		}
		
	
	}

}
