package ch17.lecture.p02terminal;

import java.util.*;

public class C05Find {
	public static void main(String[] args) {
		//findFirst : 발견되는 첫 번째 원소
		//findAny 
		
		//Optional<T> : 있을수도 있고 없을 수도 있는 타입의 객체<제네릭 타입>
		Optional<String> o1 = Optional.of("java");
		System.out.println(o1.isPresent()); //true
		System.out.println(o1.isEmpty()); //false
		String s1 = o1.get();
		System.out.println(s1); //java
		String s2 = o1.orElse("default");
		System.out.println(s2); //java
		
		System.out.println();
//		Optional<String> o2 = Optional.of(null);
		Optional<String> o2 = Optional.ofNullable(null);
		System.out.println("-----" + o2 + "-----");
		System.out.println(o2.isPresent()); //false
		System.out.println(o2.isEmpty()); //true
//		String s3 = o2.get();
//		System.out.println(s3);
		
		String s4= o2.orElse("default");
		System.out.println(s4);
	}
}
