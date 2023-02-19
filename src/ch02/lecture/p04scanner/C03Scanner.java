package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C03Scanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째값 입력>");
		String str1 = scanner.nextLine(); //nextline이 입력하는 값이 string이므로 string데이터 타입의 변수로 값을 받음
		
		System.out.println("두번째값 입력>");
		String str2 = scanner.nextLine();
		
		
		//위에서 string으로 받았는데 연산을 하고싶은 경우 그냥 두면 연결연산자로 계산되니까 바꿔주어야 함. 
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		System.out.println(num1 + num2);
		
	
}
}