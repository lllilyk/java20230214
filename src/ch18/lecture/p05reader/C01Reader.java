package ch18.lecture.p05reader;

import java.io.*;

public class C01Reader {
	public static void main(String[] args) {
		// Reader : 문자 단위 입력 스트림
		// 주요 메소드 : read
		
		String name = "output/writer2.txt";
		
		try (Reader rd = new FileReader(name)){
			int c1 = rd.read(); //'가' //1byte씩 읽으니까 첫번째 글자인 '가'출력
			System.out.println(c1); //'가'의 유니코드가 출력됨
			System.out.println((char)c1); //'가'로 출력하고 싶으면 이렇게
			
			int data = 0;
			while((data = rd.read()) != -1) {
				System.out.println(data + ":" + (char) data);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
