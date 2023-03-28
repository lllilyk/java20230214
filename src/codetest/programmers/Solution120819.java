package codetest.programmers;

public class Solution120819 {
	public static void main(String[] args) {
//		int money = 15000;
		int money = 5500;

		int[] answer = new int[2];
		
		int a = money / 5500;
		int b = money % 5500;
		
		answer[0] = a;
		answer[1] = b;
		
		System.out.println(answer[0] + ", " + answer[1]);
	   
	}
}
