package ch15.exercise.exam08;

import java.util.*;

import ch15.lecture.p03set.*;

public class HashSetExample {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
	
		set.add(new Student(1, "홍길동"));
		set.add(new Student(2, "신용권"));
		set.add(new Student(1, "조민우"));
	
		//hashCode와 equals 메소드 재정의하면서 studentNum이 같으면 아래코드의 결과가 true
		//이미 있는 값이기 때문에 중복 저장x
		System.out.println(set.contains(new Student(1, "조민우"))); //true
		
		System.out.println("저장된 객체 수 : " + set.size());
		for(Student s : set) {
			System.out.println(s.studentNum + ":" + s.name);
		}
	}
}
