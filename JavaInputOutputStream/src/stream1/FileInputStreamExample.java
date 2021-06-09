package stream1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamExample {
	

	public static void main(String[] args) {
		
		try {
			FileInputStream fint = new FileInputStream("E:\\fls.txt");
			
			int i = 0;
			while((i=fint.read()) != -1) {
			
				System.out.print((char)i);
			}
			
			
			fint.close();
			
			
		} catch (Exception e) {
	
			e.printStackTrace();
		}
		
		

	}

}
