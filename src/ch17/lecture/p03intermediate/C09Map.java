package ch17.lecture.p03intermediate;

import java.util.*;

public class C09Map {
	public static void main(String[] args) {
		/*
		List<String> list = List.of("java", "html", "css");
		
		list.stream()
			.map(s -> "hello " + s)
			.forEach(System.out::println);*/
	
		//원소가 String이면 매핑되는 결과도 String일까?
		//아니다. 파라미터의 타입과 리턴 타입이 꼭 같지 않아도 됨
	
		List<String> list = List.of("good", "happy", "full");
		
		list.stream()
			.map(s -> "I'm " + s)
			.forEach(System.out::println);
	
	}
}
