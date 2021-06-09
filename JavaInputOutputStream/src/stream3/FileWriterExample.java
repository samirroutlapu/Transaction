package stream3;

import java.io.FileWriter;

public class FileWriterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileWriter fw = new FileWriter("F:\\nit.txt");
			fw.write("I Love My Country");
			fw.close();
			
			
			
			
			
		} catch (Exception e) {
			
			System.out.println("Error");
		}
		System.out.println("Success");

		
		
	
	}

}
