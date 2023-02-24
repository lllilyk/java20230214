package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C09Sort {
	public static void main(String[] args) {
		// sort : 정렬
		int[] arr1 = {9, 0, 2, 3, 8, -1};
		
		System.out.println(Arrays.toString(arr1));
		
		// 정렬(오름차순)
		Arrays.sort(arr1);
		
		System.out.println(Arrays.toString(arr1));
		
//		Arrays.sort(arr1, (int a, int b) -> b - a);
		
		// 비교가 가능하면 타입 상관없이 가능
		
		//string은 유니코드 순으로 정렬 대문자 > 소문자 순
		String[] arr2 = {"java", "hello", "html", "css", "Java", "Css"};
		
		System.out.println(Arrays.toString(arr2));
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		
		
		
		
		
		
	}
	
}
