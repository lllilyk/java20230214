package ch18.lecture.p08byte_to_char;

import java.io.*;

public class C01OutputStreamWriter {
	public static void main(String[] args) throws Exception {
		
		String fileName = "output/byte1.txt";
		OutputStream os = getOutput(fileName); //getOutput() 메소드 호출

		//798p 참고
		OutputStreamWriter osw = new OutputStreamWriter(os);
		
		osw.write(0);
		osw.write('a'); //영어는 숫자와 동일하게 1byte니까 상관없음
		osw.write('b');
		osw.write('한'); //한글은 3byte라서 제대로 출력되지 못함
		// 12번째 코드 작성으로 가능해짐
		
		osw.close();
	}
	
	public static OutputStream getOutput(String fileName) throws FileNotFoundException {
		OutputStream os = new FileOutputStream(fileName);
		
		return os;
	}
}
