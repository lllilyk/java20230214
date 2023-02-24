package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C07CopyMatrix {
	public static void main(String[] args) {
		//배열의 배열을 복사하기
//		int[][] arr1 = {
//				{5, 7, 9, 10},
//				{3, 2, 1, 0}
//		};
//		
//		// 깊은 복사(deep copy) : {}내의 원소 하나하나를 복사하기 때문에 기존 배열의 {}내 원소가 바뀌어도 새로운 배열의 {}내 원소는 변경x
//		int[][] arr2 = new int[arr1.length][];
//		
//		for(int i = 0; i < arr1.length; i++) {
//			arr2[i] = Arrays.copyOf(arr1[i], arr1[i].length);
//		}
//		
////		System.out.println(Arrays.toString(arr1[0]));
////		System.out.println(Arrays.toString(arr1[1]));
////		
////		System.out.println(Arrays.toString(arr2[0]));
////		System.out.println(Arrays.toString(arr2[1]));
//		
//		arr1[0][0] = 50;
//		System.out.println(arr1[0][0]);
//		System.out.println(arr2[0][0]);
		
		System.out.println("--------------");
		
		//향상된 for문을 사용해서 깊은 복사 하기

		int[][] arr1 = {
		         {5, 7, 9, 10},
		         {3, 2, 1, 0}
		};

		for(int[] arr : arr1){
		   System.out.println(Arrays.toString(arr));
		}

		
	}
}
