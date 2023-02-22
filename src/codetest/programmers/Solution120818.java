package codetest.programmers;

public class Solution120818 {
	public static void main(String[] args) {
		
		int price = 580000;
		double result = 0;
		if(price >= 100000 && price < 300000){
            result = price * 0.95;
        } else if(price >= 300000 && price < 500000){
        	result = price * 0.9;
        } else if(price >= 500000){
        	result = price * 0.8;
        }
		int result1 = (int)result;
		System.out.println(result1);
	}
}
