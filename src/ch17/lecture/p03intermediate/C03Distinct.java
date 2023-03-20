package ch17.lecture.p03intermediate;

import java.util.*;

public class C03Distinct {
	public static void main(String[] args) {
		// distinct 중복 제거
		List<Integer> list = List.of(1, 2, 3, 0, 1, 2, 3);
		
		long count = list.stream()
			.count();
		
		System.out.println(count);
		
		//중복 값이 모두 제거 됨
		long count2 = list.stream()
			.distinct()
			.count();
		
		System.out.println(count2);
		
		
	}
}
