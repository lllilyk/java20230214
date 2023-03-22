package ch18.lecture.p05reader;

import java.io.*;
import java.util.*;

public class C02Reader {
	public static void main(String[] args) {
		String name = "output/writer2.txt";
		
		try (var rd = new FileReader(name)){
			System.out.println((char)rd.read()); //첫번째문자 출력
			System.out.println((char)rd.read()); //두번째문자 출력
			System.out.println((char)rd.read()); //세번째문자 출력
			
			char[] data = new char[5];
			
			rd.read(data);
			System.out.println(Arrays.toString(data));
			
			rd.read(data);
			System.out.println(Arrays.toString(data)); //공백도 한 문자로 취급
			
			rd.read(data);
			System.out.println(Arrays.toString(data));
			
			rd.read(data);
			System.out.println(Arrays.toString(data));
			
			rd.read(data);
			System.out.println(Arrays.toString(data));
			
			rd.read(data);
			System.out.println(Arrays.toString(data));
			
			rd.read(data);
			System.out.println(Arrays.toString(data)); //마지막 읽을 때 흔적 혼란 주의
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
