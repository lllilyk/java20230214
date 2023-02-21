package codetest.programmers;

public class Solution120822 {
	public static void main(String[] args) {
		
		/*String str = "bread";
		for(int i = 1; i <=str.length() ; i++) {
			System.out.print(str.charAt(str.length() -i));
		}*/

		String str = "bread";
//		System.out.println(str.length());
//		System.out.println(str.length()-1);
//		System.out.println(str.length()-2);
//		System.out.println(str.length()-3);
//		System.out.println(str.length()-4);
		
//		for(int i = str.length(); i >= 1 ; i--) {
			for(int j = str.length()-1; j >= 0; j--) {
			System.out.print(str.substring(j,j+1));
		}
//	}

	}
}
