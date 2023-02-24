package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C02Copyof {
	public static void main(String[] args) {
		int[] arr1 = {9, 8, 1, 2, 3};
		
		int[] arr2 = new int[arr1.length];
		
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		arr1[2] = 10;
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2)); //참조한것이 아니라 새로운 인스턴스를 생성했으므로 영향x
	}
}
