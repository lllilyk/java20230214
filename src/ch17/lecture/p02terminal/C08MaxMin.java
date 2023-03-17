package ch17.lecture.p02terminal;

import java.util.*;

public class C08MaxMin {
	public static void main(String[] args) {
		int[] arr = {3, 1, 9, 0, 2, 4, 5};
		int max = Arrays.stream(arr)
			.max()
			.getAsInt(); //get메소드 없는 대신 getAsInt 메소드로 Integer 꺼내서 출력
		
		//System.out.println(max);
		
		int min = Arrays.stream(arr)
				.min()
				.getAsInt();
		
		System.out.println(min);
	}
}
