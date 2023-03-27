package ch11.lecture.p04throw;

import java.io.*;

public class C13Throw {
	
	public static void method3() throws Exception {
		//의미없이 그냥 딸려있는 경우도 많음
	}
	
	//실제로는 이렇게 무조건 throws Exception을 작성하는 경우 왕왕 있음
	public static void main(String[] args) throws Exception{
		method2();
	}
	
	public static void method2() throws Exception{
		method1();
	}
	
	public static void method1() throws Exception{
		new FileInputStream("");
	}
}
