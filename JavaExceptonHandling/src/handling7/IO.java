package handling7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IO {
	static FileInputStream file = null;
	public static void main(String[] args) {
		
		try
		{
			IO.file =new FileInputStream("D:\\ab.txt");
			System.out.println("File Opened");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Exception:No such file to open");
		}
		finally
		{
			if(file!=null)
			{
				try {
					file.close();
					System.out.println("file closed");
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				
			}
		}
		

	}

}
