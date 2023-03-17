package ch17.lecture.p02terminal;

import java.util.*;

public class C09Reduce {
	public static void main(String[] args) {
		List<Integer> list = List.of(9, 1, 2, 3, 5);
		Integer sum = list.stream()
			.reduce((a, b) -> 0) //두 개의 값을 넣으면 하나의 값을 리턴 >> 결과 값과 다음 값으로 또 다음 결과 값 리턴 >> 반복
			.get();
		
		System.out.println(sum);
		
		Integer max = list.stream()
				.reduce(Math::max) //.reduce에 마우스 호버해서 Optional 메소드라고 나오면 .get() 쓰기
				.get();
		
		System.out.println(max);
	
		Integer min = list.stream()
				.reduce(Math::min)
				.get();
		
		System.out.println(min);
	}
}
