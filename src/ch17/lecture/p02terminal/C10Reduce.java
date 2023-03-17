package ch17.lecture.p02terminal;

import java.util.*;

public class C10Reduce {
	public static void main(String[] args) {
		List<String> list = List.of("java", "css", "html", "jsp");
		
		Integer sum = list.stream()
			.map(e -> e.length()) //파라미터로 받은 아이템을 길이로 매핑(산출)하는 메소드 
			//.reduce((a,b) -> a + b)
			.reduce(Integer::sum)
			.get();
		
		System.out.println(sum);
	}
}
