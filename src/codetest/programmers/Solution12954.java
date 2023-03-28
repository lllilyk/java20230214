package codetest.programmers;

public class Solution12954 {
public static void main(String[] args) {
		
		int a = 4;
		//System.out.println(a.length);
		//int[] arr = new int[a.length];
		int[] arr1 = new int[a];
		//System.out.println(arr1.length);
		
		long[] answer = new long[5];
		int x = 2;
		int n = 5;
		for (int i = 1; i <= n; i++) {
			answer[i-1] = x * i;
		}
		
		for(int i = 1; i <= n; i++) {
			//System.out.println(answer[i-1]);
		}
		
		for(long aa : answer) {
			System.out.println(aa);
		}
	}
}
