package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C06Scanner {
	// 백준 2525
	public static void main(String[] args) {
//		1) 한줄 전체를 스캔한 뒤에 토큰 하나하나를 따로 스캔
		//여러줄이니까 우리한테 익숙한 textblock쓰기
//		String input = """
//				14 30
//				20""";
		
//		String input = """
//				17 40
//				80""";
		
		String input = """
				23 48
				25""";
		
		Scanner scanner = new Scanner(input);
//		Scanner scanner = new Scanner(System.in);
		
		// 코드 작성
		String line1 = scanner.nextLine();
		String line2 = scanner.nextLine();
		
		Scanner line1Scanner = new Scanner(line1);
		Scanner line2Scanner = new Scanner(line2); //한줄 전체를 스캔
		
		int currentHour = line1Scanner.nextInt(); //한 줄 읽은 것 중 토큰 하나하나를 따로 스캔
		int currentMin = line1Scanner.nextInt();
		
		int pastMin = line2Scanner.nextInt();
		
		currentHour = (currentHour + (currentMin + pastMin) / 60) % 24; //24시간이므로 24로 나눈 나머지
		currentMin = (currentMin + pastMin) % 60; //60분이므로 60으로 나눈 나머지
		
		System.out.println(currentHour + " " + currentMin);
		
		
	}
}