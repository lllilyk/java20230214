package ch17.lecture.p02terminal;

import java.util.*;

public class C03ForEach {
	public static void main(String[] args) {
		// 모든 element를 람다로 이루어진 메소드 안에 넣기
		// stream은 람다와 궁합 좋음

		List<String> list = List.of("java", "css", "spring", "html");

		// 각 원소들에게 어떤 일을 시키고 싶을 때 forEach 메소드 쓰기
		list.stream()
				.forEach(s -> System.out.println(s)); // 원소들 한 번씩 출력

		list.stream()
				.forEach(s -> System.out.println("원소 : " + s));

	}
}
