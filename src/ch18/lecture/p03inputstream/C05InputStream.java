package ch18.lecture.p03inputstream;

import java.io.*;

public class C05InputStream {
	public static void main(String[] args) {
		String src = "output/cat.jfif";
		String des = "output/cat_copy.jfif";
		
		try (
				var is = new FileInputStream(src);
				var os = new FileOutputStream(des);) {

			int data = 0;
			
			while ((data = is.read()) != -1) {
				os.write(data);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("복사완료");
	}
}
