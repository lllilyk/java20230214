package ch17.exercise.exam05;

import java.util.*;

public class Example {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("This is a java book",
				"Lamda Expressions",
				"Java8 supports lambda expressions");

		// 대소문자 상관없이 출력하라고 명령
		// : toLowerCase() 메소드 사용

		// for문
		for (String e : list) {
			if (e.toLowerCase().contains("java")) {
				System.out.println(e);
			}
		}
	}

}
