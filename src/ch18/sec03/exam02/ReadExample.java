package ch18.sec03.exam02;

import java.io.*;

public class ReadExample {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("output/test2.db");
			//출발지를 test2.db파일로 하는 바이트 입력 스트림 생성
			
			byte[] data = new byte[100]; //배열의 크기가 100이니까 한 번에 100byte씩 읽을 수 있음
			// test2.db는 3bytes 크기의 파일

			while (true) {
				int num = is.read(data); //최대 100byte를 읽고 읽은 바이트는 data 배열에 저장, 읽은 바이트 수는 리턴 
				if (num == -1) break; //파일 끝에 도달했을 경우

				for (int i = 0; i < num; i++) { //0, 1, 2하고 나면 더이상 없으니까 -1리턴
					System.out.println(data[i]); //읽은 바이트를 매개변수로 사용해서 해당 인덱스 값 출력
				}
			}
			
			is.close();  //입력 스트림을 닫고 사용 메모리 해제
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
