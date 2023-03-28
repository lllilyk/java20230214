package codetest.programmers;

import java.util.*;

public class Solution120847 {
	public static void main(String[] args) {
//		int[] numbers = {1, 2, 3, 4, 5};
		
		int[] numbers = {0, 31, 24, 10, 1, 9};
		
		Integer[] newArray = new Integer[numbers.length];
		int i = 0;
		for (int value : numbers) {
			newArray[i++] = Integer.valueOf(value);
		}
		
		Arrays.sort(newArray, Collections.reverseOrder());
		
		int answer = newArray[0] * newArray[1];
		System.out.println(answer); 
		
		/*
		int max = Integer.MIN_VALUE;
		for(int Max : numbers) {
			if(Max>max) {
				max = Max;
			}
		}
		*/
		
		
		/*
		for(int i = 0; i <numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		*/
		
/*		
		Arrays.sort(numbers);
		
		int answer = (numbers[numbers.length-1]) * (numbers[numbers.length-2]);
		System.out.println(answer);
	*/	
	}
}
