package ch18.sec03.exam03;

import java.io.*;

public class CopyExample2 {
	public static void main(String[] args) throws Exception {
		String originalFileName = "output/test.jfif";
		String secondFileName = "output/test3.jfif";
		
		InputStream is = new FileInputStream(originalFileName);
		OutputStream os = new FileOutputStream(secondFileName);
		
		is.transferTo(os);
		
		os.flush();
		os.close();
		is.close();
	}
}
