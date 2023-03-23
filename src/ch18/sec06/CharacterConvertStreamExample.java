package ch18.sec06;

import java.io.*;

public class CharacterConvertStreamExample {
	
	//test.txt에 원래는 ABCDEFGH가 담겨있었는데 
	//문자 변환 스트림을 사용합니다. 로 바뀜
	public static void main(String[] args) throws Exception{
		write("문자 변환 스트림을 사용합니다.");
		String data = read();
		System.out.println(data); //아래의 read 메소드 호출
	}
	
	public static void write(String str) throws Exception {
		OutputStream os = new FileOutputStream("output/test.txt");
		Writer writer = new OutputStreamWriter(os, "UTF-8");
		//character를 1byte로 표현하는 방법 - UTF-8
		writer.write(str);
		writer.flush();
		writer.close();
	}
	
	public static String read() throws Exception {
		InputStream is = new FileInputStream("output/test.txt");
		Reader reader = new InputStreamReader(is, "UTF-8");
		char[] data = new char[100];
		int num = reader.read(data);
		reader.close();
		String str = new String(data, 0, num);
		return str; 
	}
}
