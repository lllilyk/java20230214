package ch18.lecture.p06buffered;

import java.io.*;

public class C06BufferedReader {
	public static void main(String[] args) {
		String name = "output/buffered5.txt";

		try (FileReader fr = new FileReader(name);
				BufferedReader br = new BufferedReader(fr);) {
			//이렇게 변수에 담아서 만들어도 되고 ch18.sec07.exam02;처럼 바로 만들어도됨
			
			String s = null;
			while((s = br.readLine()) != null) {				
				System.out.println(s);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
