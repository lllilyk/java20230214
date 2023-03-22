package ch18.lecture.p03inputstream;

import java.io.*;

public class C07InputStream {
	public static void main(String[] args) {
		String src = "output/cat.jfif";
		String des = "output/cat_copy3.jfif";
		
		try (var is = new FileInputStream(src);
				var os = new FileOutputStream(des);){
			
			is.transferTo(os); //입력 스트림에서 출력 스트림으로 바이트가 잘 복사됨 
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
