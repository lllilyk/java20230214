package ch17.lecture.p03intermediate;

import java.util.*;

public class C07Filter {
	public static void main(String[] args) {
		// filter : 걸러내기
		List<Integer> list = List.of(3, 7, -1, -3, 5, 2, 8);

		System.out.println("양수만-----");

		list.stream()
				.filter(s -> s > 0)
				.forEach(System.out::println);
		
		System.out.println();
		System.out.println("음수만-----");
		list.stream()
			.filter(s -> s < 0)
			.forEach(System.out::println);
		
		System.out.println();
		System.out.println("짝수만-----");

		list.stream()
				.filter(s -> (s % 2) == 0)
				.forEach(System.out::println);

		System.out.println();
		System.out.println("홀수만-----");

		list.stream()
				.filter(s -> (s % 2) == 1)
				.forEach(System.out::println);
	}
}
