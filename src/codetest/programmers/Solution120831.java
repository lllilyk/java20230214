package codetest.programmers;

public class Solution120831 {
	 public int solution(int n) {
	        int sum = 0;
	        int i = 0;
	        for(i=0; i<=n; i+=2){
	            sum += i;
	        }
	        return sum;
	    }
}