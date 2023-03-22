package ch18.sec02.exam02;

import java.io.*;

public class WriteExample {
	public static void main(String[] args) {
		//try-with-resources 사용
		try(OutputStream os = new FileOutputStream("output/test2.db");){
		//데이터 도착지를 test2.db 파일로 하는 바이트 출력 스트림 생성	
		
			byte[] array = {10, 20, 30};
			
			os.write(array); //배열의 모든 바이트를 출력
			
			os.flush(); //내부 버퍼에 잔류하는 바이트를 출력하고 버퍼를 비움
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
