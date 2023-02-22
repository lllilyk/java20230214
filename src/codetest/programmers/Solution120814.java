package codetest.programmers;

public class Solution120814 {
	public static void main(String[] args) {
		
		int n = 15;
		int result = 0;
		
		if(n % 7 == 0) {
			result = n / 7;
		} else {
			result = n / 7 + 1;
		}
		System.out.println(result);
	}
}
