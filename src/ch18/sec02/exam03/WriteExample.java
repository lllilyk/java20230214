package ch18.sec02.exam03;

import java.io.*;

public class WriteExample {
	public static void main(String[] args) {
		try (OutputStream os = new FileOutputStream("output/test3.db");){
			//데이터 도착지를 test3.db 파일로 하는 바이트 출력 스트림 생성
			
			byte[] array = { 10, 20, 30, 40, 50 };
			
			os.write(array, 1, 3); //array 배열의 1번째 인덱스부터 3개 출력 
			os.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
