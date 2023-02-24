package ch05.lecture.p07arrays;

import java.util.Arrays;

public class sortexercise7199 {
	public static void main(String[] args) {
		int[] array = {1, 5, 3, 8, 2};
		
		Arrays.sort(array);
		
		System.out.println(array[array.length - 1]); //오름차순된 array배열의 가장 오른쪽 값을 결과로 보여라!
		
	}
}
