package stream2;


import java.io.*;

public class BufferedOutputStreamExample {

	
	public static void main(String[] args) {
	
			
			try {
				FileOutputStream file = new FileOutputStream("F:\\file.txt");
				BufferedOutputStream bout = new BufferedOutputStream(file);
				
				String s = "Welcom to java";
				byte[] arr = s.getBytes();
				bout.write(arr);
				bout.flush();
				bout.close();
				file.close();
				
							
			} catch (Exception e) {
			
				System.out.println("Error");
			}
			
			System.out.println("Success");
	
		

	}

}
