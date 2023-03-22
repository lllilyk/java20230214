package ch18.sec04.exam02;

import java.io.*;

public class ReadExample {
	public static void main(String[] args) {
		try {
			Reader reader = null;
			
			//1 문자씩 읽기
			reader = new FileReader("output/test.txt");
			while(true) {
				int data = reader.read();
				if(data == -1) break;
				System.out.print ((char)data);
			}
			reader.close();
			System.out.println();
			
			//문자 배열로 읽기
			reader = new FileReader("output/test.txt");
			char[] data = new char[100]; //한 번 읽을 때 100개씩 읽음
			while(true) {
				int num = reader.read(data);
				if(num == -1) break;
				for(int i = 0; i < num; i++) {
					System.out.print(data[i]);
				}
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
