package ch18.exercise.exam10;

import java.io.*;

public class exam10practice {
	public static void main(String[] args) throws Exception {
		String origin = "output/cute.jpg"; //70,300byte
		String copy = "output/cute_copy.jpg"; 
		
		//바이트 기반 스트림과 성능 향상 보조 스트림을 사용해서
		//복사하는 코드 작성
		InputStream is = new FileInputStream(origin);
		OutputStream os = new FileOutputStream(copy);
		OutputStream bos = new BufferedOutputStream(os);
		
		//is.transferTo(bos);
		
		//InputStream - read()
		//OutputStream - write()
		
		byte[] data = new byte[100000];
		while(true) {
			int num = is.read(data);
			if(num == -1) break;
			bos.write(data, 0, num);
			}

		is.close();
		bos.flush();
		bos.close();
	}
}
