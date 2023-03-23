package ch18.lecture.p02outputstream;

import java.io.*;

public class C02Close {
	public static void main(String[] args) {
		// finally 블럭에서도 사용할 수 있게 try 블럭 밖에서 선언
		OutputStream os = null;

		try {
			// 스트림 열고
			os = new FileOutputStream("output/output.txt");

			// 어떤 작업
			os.write(1);

			os.flush(); // 습관적으로 써주기
			os.close(); // 꼭 해야함 //어떤 일이 끝나면 닫아주기
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 꼭 해야함
			if (os != null) {
				try {
					os.close(); // 블럭이 다르기 때문에 OutputStream os에 접근이 불가 >> 오류 발생					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		}

	}
}