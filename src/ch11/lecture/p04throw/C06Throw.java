package ch11.lecture.p04throw;

import java.io.*;

public class C06Throw {
	public static void main(String[] args) {

	}

	public static void method2() throws Exception { //Exception이 ClassNotFoundException, FileNotFoundException의 상위타입이므로 가능
		int a = 1;
		if(a ==1 ) {
			throw new ClassNotFoundException();
		} else {
			throw new FileNotFoundException();
		}
	}
	
	
	public static void method1() throws ClassNotFoundException, FileNotFoundException { //여기에
		int a = 1;
		if(a == 1) { //밑에 throw 키워드 작성한 개수만큼 throws 키워드 뒤에 명시해줘야함
			throw new ClassNotFoundException();
		} else {
			throw new FileNotFoundException();
		}
	}
}
