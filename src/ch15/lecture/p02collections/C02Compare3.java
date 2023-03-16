package ch15.lecture.p02collections;

import java.util.*;

public class C02Compare3 {
	public static void main(String[] args) {
		
		// 이름 순으로 정렬
		List<Character2> hmm = List.of(
				new Character2("jung", 24),
				new Character2("park", 30),
				new Character2("kang", 28),
				new Character2("kim", 27)
				);
		
		List<Character2> yeah = new ArrayList<>(hmm);
		
		Collections.sort(yeah, (h, j)-> h.getName().compareTo(j.getName()));
		System.out.println(yeah);
		
		Collections.reverse(yeah);
		System.out.println(yeah);
	}
}


class Character2 {
	//필드
	private String name;
	private int age;
	
	//생성자
	public Character2 (String name, int age) {
		this.name = name;
		this.age = age;
	}

	//Getter & Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//toString() 메소드 재정의
	@Override
	public String toString() {
		return "Character [name=" + name + ", age=" + age + "]";
	}
	
}