package codetest.programmers;

class Solution120833 {
	public static void main(String[] args) {
		//배열 자르기
	    
			int[] numbers = {1, 2, 3, 4, 5};
			// output : 2, 3, 4
			
			int num1 = 1;
			int num2 = 3;
			
	        int len = num2 - num1 + 1;
	        int[] answer = new int[len]; 
	        
	        for (int i = num1; i <= num2; i++) {
	            	System.out.println(numbers[i]);
	            }
	        
	        /*int[] numbers = {1, 3, 5};
			// output : 3, 5
			
			int num1 = 1;
			int num2 = 2;
			
	        int len = num2 - num1 + 1;
	        int[] answer = new int[len]; 
	        
	        for (int i = num1; i <= num2; i++) {
	            	System.out.println(numbers[i]);
	            }*/
	        }
	    }
	
