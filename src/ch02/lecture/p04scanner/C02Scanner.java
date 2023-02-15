package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C02Scanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //ctrl + shift + o
		
		//엔터를 만날때까지 스캐너가 스캔을 하고 읽다가 엔터를 만나면 다음줄로 넘어감
		
		System.out.println("키보드로 작성해보세요>");
		String line = scanner.nextLine();
		
		System.out.println("입력된 값 출력");
		System.out.println(line);
		
	}

}
