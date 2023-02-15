package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C05Scanner {
	//백준 1000번
	public static void main(String[] args) {
		//아래의 두 줄을 작성하면 콘솔에 1 2를 치지 않고 결과만 얻을 수 있고 
		//아래 두 줄을 작성하지 않고 세번째 줄만 작성하면 콘솔에 1 2를 치고 결과를 같이 얻을 수 있음
//		String input = "1 2";
//		Scanner scanner = new Scanner(input); //input 값을 scan해라
		Scanner scanner = new Scanner(System.in); //콘솔에 넣는 값을 읽어라
		
		//코드 작성
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		int res = num1 + num2;
		
		System.out.println(res);
	}
}
