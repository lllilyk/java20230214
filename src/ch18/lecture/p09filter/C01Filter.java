package ch18.lecture.p09filter;

import java.io.*;

public class C01Filter {
	public static void main(String[] args) {
		// stream 연결 가능
		String fileName = "output/byte1.txt";

		try (
				FileInputStream fis = new FileInputStream(fileName);
				InputStreamReader isr = new InputStreamReader(fis); // FileInputStream 감싸기
				BufferedReader br = new BufferedReader(isr); // InputStreamReader감싸기
		) {

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
