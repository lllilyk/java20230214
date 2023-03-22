package ch18.sec02.exam01;

import java.io.*;

public class WriteExample {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("output/test1.db");
			
			byte a = 10;
			byte b = 20;
			byte c = 30;
			
			//Output Stream의 주요 메소드 write() : 1 byte씩 출력
			os.write(a);
			os.write(b);
			os.write(c);
			
			os.flush();
			os.close();
			
		} catch (IOException e) {
			e.printStackTrace();            
		}
	}
}
