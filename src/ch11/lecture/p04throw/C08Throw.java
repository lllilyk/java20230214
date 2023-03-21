package ch11.lecture.p04throw;

import java.io.*;

public class C08Throw {
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
		
		//던지는 exception이 2개인 경우
		//1)---------------------------------------------------------------
		try {
			method1();
		} catch (FileNotFoundException | ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//2)----------------------------------------------------------------
		try {
			method1();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//3) 위에 throws 선언------------------------------------------------
		method1();
	}
	
	public static void method1() throws FileNotFoundException, ClassNotFoundException{
		
	}
}
