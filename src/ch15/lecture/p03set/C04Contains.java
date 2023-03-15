package ch15.lecture.p03set;

import java.util.*;

public class C04Contains {
	public static void main(String[] args) {
		//of메소드 사용했으므로 변경 불가
		Set<String> set = Set.of("Java", "css", "html", "jsp");
		
		//contains : 해당 원소가 있는지 boolean타입으로 리턴
		System.out.println(set.contains("java"));
		System.out.println(set.contains("jsp"));
		System.out.println(set.contains("python"));
		
		System.out.println(set.contains(new String("Java")));
		//서로다른 객체이지만 eqauls결과는 true임
	}
}
