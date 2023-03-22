package ch18.sec03.exam02;

import java.io.*;

public class ReadExample {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("output/test2.db");

			byte[] data = new byte[100];

			while (true) {
				int num = is.read(data); //3bytes 크기의 파일
				if (num == -1)
					break;

				for (int i = 0; i < num; i++) { //0, 1, 2하고 나면 더이상 없으니까 -1리턴
					System.out.println(data[i]);
				}
			}
			
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
