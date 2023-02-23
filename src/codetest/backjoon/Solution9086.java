package codetest.backjoon;

import java.util.Scanner;

public class Solution9086 {
	public static void main(String[] args) {

		String input = """
				3
				ACDKJFOWIEGHE
				O
				AB
				""";
		
		Scanner scanner = new Scanner(input);
		
		String line1 = scanner.nextLine();
		int line11 = Integer.parseInt(line1);
//		System.out.println(line11);
		
		/*String line2 = scanner.nextLine();
		System.out.println(line2);
		char a = line2.charAt(0);
		//System.out.println(a);
		
		char b = line2.charAt(line2.length()-1);
		System.out.println(b);
		System.out.printf("%s%s", a, b);*/
		
		
		//졸 짜증
		for(int i = 0; i < line11; i++) {
			String str = scanner.nextLine();
			
			char first = str.charAt(0);
			char last = str.charAt(str.length() -1);
			
			System.out.println("" + first + last);
		}
		
	}
}
