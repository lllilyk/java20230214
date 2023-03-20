package ch17.lecture.p03intermediate;

import java.util.*;

public class C15FlatMap {
	public static void main(String[] args) {
		List<String> list = List.of(
				"hello world",
				"java program",
				"css html js"
				);
		
		//string.split 메소드
		//구분자를 기준으로 구분
		long count = list.stream()
			.flatMap(s -> Arrays.stream(s.split(" ")))
			.count();
		
		System.out.println(count);
	}
}
