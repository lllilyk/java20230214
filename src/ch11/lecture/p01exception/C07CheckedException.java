package ch11.lecture.p01exception;

import java.io.*;

public class C07CheckedException {
	public static void main(String[] args) {
		
		//이렇게 작성하면 FileNotFoundException 발생
		//FileInputStream file = new FileInputStream(".gitignore");
		
		//checkedexception은 exception을 다루는 코드가 꼭 필요!
		try {
			FileInputStream file = new FileInputStream(".gitignore");
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("continue.....");
	
	
	}
}
