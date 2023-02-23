package codetest.backjoon;

import java.util.Scanner;

public class Solution10798 {
	public static void main(String[] args) {
		
		String input = """
				AABCDD
				afzz
				09121
				a8EWg6
				P5h3kx
				""";
		
		Scanner scanner = new Scanner(input);
		
		String line = scanner.nextLine();
		String[] arr = line.split("");
		// 첫번째줄 A에 두고 한칸씩 아래글자를 읽고 돌아와서 다음 A로 
		
		String answer = "";
		
		for(int i = 0; i <line.length(); i++) {
			for(int j = 0; j<5 ; j++) {
				
			}
		}
		
		
		
	}
}