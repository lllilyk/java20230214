package ch02.lecture.p05print;

import java.util.Scanner;

public class C05Print {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); //순서대로 코드를 읽어나가기 때문에 스캐너 코드가 가장 위에 있어야함
		
		System.out.println("첫번째 수 :");
		int num1 = scanner.nextInt();
		
		System.out.println("두번째 수 :");
		int num2 = scanner.nextInt();
		
		int sum = num1 + num2;
		
		System.out.println(num1 + " + " + num2 + " = " + sum);
		System.out.printf("%d + %d = %d%n", num1, num2, sum);
		
	}

}
