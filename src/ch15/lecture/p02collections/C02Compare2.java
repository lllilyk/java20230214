package ch15.lecture.p02collections;

import java.util.*;

public class C02Compare2 {
	public static void main(String[] args) {
		
		List<Character> list = List.of(
				new Character("jung", 24),
				new Character("park", 30),
				new Character("kang", 28),
				new Character("kim", 27)
				);
		
		List<Character> list2 = new ArrayList<>(list);
		
		Character minAge = Collections.min(list2, (y, k) -> y.getAge() - k.getAge());
		System.out.println(minAge);
		
		
		/*
		//원하는대로 쓸 수 있도록 list2에 list담기
		List<Character> list2 = new ArrayList<>(list);
		
		System.out.println(Collections.max(list2, (y, m)-> y.getAge() - m.getAge()));
		Collections.sort(list2, (j, s) -> j.getAge() - s.getAge());
		System.out.println(list2);
		
		//거꾸로 정렬
		Collections.reverse(list2);
		System.out.println(list2);*/
		
	}
}

class Character {
	//필드
	private String name;
	private int age;
	
	//생성자
	public Character(String name, int age) {
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
