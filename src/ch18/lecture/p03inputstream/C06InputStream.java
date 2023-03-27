package ch18.lecture.p03inputstream;

import java.io.*;

public class C06InputStream {
	public static void main(String[] args) {
		String src = "output/cat.jfif";
		String des = "output/cat_copy2.jfif";
		
		try(var is = new FileInputStream(src);
				var os = new FileOutputStream(des);){
			
			byte[] data = new byte[1024];
			
			int len = 0;
			while((len = is.read(data)) != -1) {
				os.write(data,0,len);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("복사 완료!!");
	}
}
