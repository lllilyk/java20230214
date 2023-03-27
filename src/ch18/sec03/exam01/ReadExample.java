package ch18.sec03.exam01;

import java.io.*;

public class ReadExample {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("output/test1.db");
			//데이터 출발지를 test1.db 파일로 하는 바이트 입력 스트림 생성
			
			while(true) {
				int data = is.read(); // 1byte씩 읽기
				if(data == -1) break; // 파일 끝에 도달했을 경우
				// read() 메소드는 
				// 더 이상 입력 스트림으로부터 바이트를 읽을 수 없는 경우 -1을 리턴하니까 
				System.out.println(data);
			}
			is.close(); // 입력 스트림을 닫고 사용 메모리 해제
			
		} catch (FileNotFoundException e) {
			//FileInputStream 생성자는 주어진 파일이 존재하지 않을 경우 FileNotFoundException을 발생시킴
			e.printStackTrace();
		} catch (IOException e) {
			//read(), close() 메소드에서 IOException 발생 가능하므로 예외 처리 해주기
			e.printStackTrace();
		}
	}
}
