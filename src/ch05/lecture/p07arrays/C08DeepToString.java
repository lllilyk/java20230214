package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C08DeepToString {
	public static void main(String[] args) {
		int[] arr1 = {5, 2, 1, 0};
		
		System.out.println(Arrays.toString(arr1));
		
		int[][] arr2 = {
				{5, 7, 9, 10},
				{3, 2, 1, 0}
		};
		
		System.out.println(arr2[0]); //{7, 8}이 참조된 주소를 보여주는 것
		System.out.println(Arrays.toString(arr2)); //{7, 8}, {2, 3}이 참조된 주소를 보여줌 
		
		System.out.println("for loop로 toString");
		for(int[] arr : arr2) {
			System.out.println(Arrays.toString(arr));
		}
		
		System.out.println("deepToString 메소드 사용");
		System.out.println(Arrays.deepToString(arr2)); //{7, 8}이 참조된 주소로 들어가서 7, 8값 자체를 보여줌
		//참조의 참조를 타고 들어가서 보여주는 메소드
		
	}
}
