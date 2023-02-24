package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C06Copy {
	// 그림 06
		public static void main(String[] args) {
			
			int[][] arr1 = {
					{3, 4},
					{9, 8}
			};
			// 얕은 복사(shallow copy) : {}{} 자체를 복사하기 때문에 기존 배열에서 {}내의 원소가 바뀌면 새로운 배열의 {}내의 원소도 변경됨
			int[][] arr2 = Arrays.copyOf(arr1, arr1.length);
			
			System.out.println(arr1.length);
			System.out.println(arr2.length);
			
			arr1[0][0] = 30;
			
			System.out.println(arr1[0][0]);
			System.out.println(arr2[0][0]);
		}
	}

