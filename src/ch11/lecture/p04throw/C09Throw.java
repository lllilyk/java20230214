package ch11.lecture.p04throw;

import java.io.*;

public class C09Throw {

	/*
	 * public static void main(String[] args) { try { method1(); } catch (Exception
	 * e) { e.printStackTrace(); } }
	 */

	// Exception은 FileNotFoundException와 ClassNotFoundException이다X 때문에 오류 발생 이렇게는 쓸수 없음
	public static void main(String[] args) {
		try {
			method1();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void method1() throws Exception {
		boolean a = true;
		if (a) {
			throw new ClassNotFoundException();
		} else {
			throw new FileNotFoundException();
		}
	}
}
