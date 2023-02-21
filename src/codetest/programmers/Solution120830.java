package codetest.programmers;

public class Solution120830 {
	public static void main(String[] args) {
		
		int n = 64;
		int k = 6;
		int answer = 0;
        int j = n/10;
        
//        System.out.println(12000 * 64 + 2000 * 6);
        
		answer = 12000*n + 2000*k;
		//여기에서 음료수 서비스를 받은 만큼 가격빼기
	
			for(int i = 0; i <= j-1; i++) {
				answer -= 2000;
			} 
			System.out.println(answer);
	}
}
