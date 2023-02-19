package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C04Scanner {
	public static void main(String[] args) {
		String input = "3 33 555 50";
		Scanner scanner = new Scanner(input);
		
//		String str = scanner.nextLine(); //한줄을 다 읽고 string으로 return.
		
		//int 하나하나를 읽고 싶다.
		int num1 = scanner.nextInt(); //띄어쓰기로 token을 구분
		System.out.println(num1); //3
		int num2 = scanner.nextInt(); 
		System.out.println(num2); //33
		int num3 = scanner.nextInt(); 
		System.out.println(num3); //555
		int num4 = scanner.nextInt(); 
		System.out.println(num4); //50
		
		System.out.println(num3 + num4);
		
	}

}
