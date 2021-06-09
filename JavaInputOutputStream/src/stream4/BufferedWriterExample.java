package stream4;

import java.io.BufferedWriter;
import java.io.FileWriter;


public class BufferedWriterExample {

	public static void main(String[] args) {
		
		
		try {
			FileWriter writer= new FileWriter("F:\\nit1.txt");
			BufferedWriter buffer = new BufferedWriter(writer);
			buffer.write("program");
			buffer.close();
			writer.close();
		} catch (Exception e) {
			System.out.println("Error");
		}

	}

}
