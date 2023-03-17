package ch17.lecture.p02terminal;

import java.util.*;

public class C07MaxMin {
	public static void main(String[] args) {
		List<Integer> list = List.of(3, 4, 1, 2, 10, 20);
		
		Integer max = list.stream()
			//.max((x, y) -> Integer.compare(x, y))
			//.max((x, y) -> x - y)
			.max(Integer::compare) //10, 11번째 줄과 같은 코드
			.get();
		
		//System.out.println(max);
		
		Integer min = list.stream()
					//.min((x, y) -> x.compareTo(y))
					.min(Integer::compareTo) //19번째 줄과 같은 코드
					.get();
		
		System.out.println(min);
	}
}
