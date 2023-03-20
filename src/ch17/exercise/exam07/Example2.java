package ch17.exercise.exam07;

import java.util.*;

public class Example2 {
	public static void main(String[] args) {
		List<Member> list = List.of(
				new Member("홍길동", "개발자"),
				new Member("김나리", "디자이너"),
				new Member("신용권", "개발자"));
		
		list.stream()
			.filter(member -> member.getJob().equals("개발자"))
			.map(Member::getName)
			.forEach(System.out::println);
	}
}