package ch18.lecture.p06buffered;

import java.io.*;

public class C05BufferedWriter {
	public static void main(String[] args) {
		String name = "output/buffered5.txt";

		try (
				FileWriter fw = new FileWriter(name);
				BufferedWriter bw = new BufferedWriter(fw);) {
			
			for(int i = 0; i < 10; i++) {
				
				bw.write("hello world");
				bw.newLine();
			}
			
			
			bw.flush(); //내부 버퍼 잔류 바이트를 출력하고 버퍼를 비우기

			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
