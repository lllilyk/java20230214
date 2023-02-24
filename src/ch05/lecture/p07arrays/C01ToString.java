package ch05.lecture.p07arrays;

import java.util.Arrays; //toString메소드 사용하려면 꼭 필요

public class C01ToString {
	public static void main(String[] args) {
		int[] arr1 = {9, 8, 7, 1, 2};
		
		for (int n : arr1) {
			System.out.println(n);
		}
		
		System.out.println("-------");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		// ctrl + shift + o
		System.out.println(Arrays.toString(arr1));
		
		String[] arr2 = {"java", "hello", "friday", "sunday"}; 
		System.out.println(Arrays.toString(arr2));		
		
		String[] arr = {"today's", "lunch", "is", "pizza", "and", "chicken"};
		System.out.println(Arrays.toString(arr));
	}
}
