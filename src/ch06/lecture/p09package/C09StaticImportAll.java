package ch06.lecture.p09package;

import static java.lang.Math.*;

public class C09StaticImportAll {
	public static void main(String[] args) {
		
		//double num1 = Math.floor(Math.random() * 6) + 1;
		//double num2 = Math.floor(Math.random() * 6) + 1;
		
		//import 함으로써 단순하게 코드변경 가능
		
		double num1 = floor(random() * 6) + 1; 
		double num2 = floor(random() * 6) + 1;
		
		System.out.println((int) num1);
		System.out.println((int) num2);
	}
}
