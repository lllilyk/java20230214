package ch03.lecture.p01arithmetic;

import java.util.Scanner;

public class C02Arithmetic {
	// 백준 1008
	public static void main(String[] args) {
		String input = "4 5";
		
		Scanner scanner = new Scanner(input);
		
		double num1 = scanner.nextDouble(); //token을 꺼낼 때 아예 double 타입으로 꺼내기
		double num2 = scanner.nextDouble();
		
		System.out.println(num1 / num2);
	}
}