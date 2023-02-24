package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C03Copyof {
	public static void main(String[] args) {
		int[] arr1 = {3, 5, 7, 9, 1};
		
		//Arrays.copyof 메소드 안에 new int 연산자 포함되어 있음
		
		// 파라미터 : 원본배열, 타겟배열길이
		int[] arr2 = Arrays.copyOf(arr1, arr1.length); // 타입선언시 초기값 할당 할 때 new 타입명 생략 가능하니까 생략된 것
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	
		arr1[3] = 99;
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2)); // 생략된 new int 연산자가 있으므로 다른 공간에 저장되어 있어서 영향x
	
	
	}
}
