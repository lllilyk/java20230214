package codetest.programmers;

public class Solution120822 {
	public static void main(String[] args) {
		
//		
//		for(int i = 1; i <=str.length() ; i++) {
//			System.out.print(str.charAt(str.length() -i));
//		}
//		
		String str = "bread";
		for(int i = str.length()-1; i >= 0 ; i--) {
			System.out.print(str.charAt(str.length()));
		}
	}

}
