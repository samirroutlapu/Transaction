package stream4;

import java.io.BufferedReader;

import java.io.FileReader;

public class BufferedReaderExample {

	public static void main(String[] args) {
		
		try {
			FileReader reader = new FileReader("F:\\nit1.txt");
			BufferedReader buffer = new BufferedReader(reader);
			int i;
			while((i=buffer.read())!=-1)
			{
				System.out.print((char)i);
			}
			
		} catch (Exception e) {
			
			
			e.printStackTrace();
		}
		
		
		
	}

}
