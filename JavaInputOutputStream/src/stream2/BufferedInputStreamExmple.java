package stream2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;


public class BufferedInputStreamExmple {

	public static void main(String[] args) throws Exception {
		FileInputStream file = new FileInputStream("F:\\file.txt");
		BufferedInputStream bout = new BufferedInputStream(file);
		int i;
		while((i=bout.read())!=-1)
		{
			System.out.print((char)i);
		}
		bout.close();
		file.close();

	}

}
