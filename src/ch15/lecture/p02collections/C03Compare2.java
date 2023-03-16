package ch15.lecture.p02collections;

import java.util.*;

public class C03Compare2 {
	public static void main(String[] args) {
		
		List<Diff> slamdunk = new ArrayList<>();
		slamdunk.add(new Diff("baekho", 17));
		slamdunk.add(new Diff("taewoong", 17));
		slamdunk.add(new Diff("daeman",19));
		slamdunk.add(new Diff("soyeon",17));
		
		/*
		List<Diff> slamdunk = List.of(
				new Diff("baekho", 17),
				new Diff("taewoong", 17),
				new Diff("daeman",19),
				new Diff("soyeon",17)
				);*/
		
		System.out.println(slamdunk);
		Collections.sort(slamdunk);
		System.out.println(slamdunk);
	}
	
}

class Diff implements Comparable<Diff> {

	// 필드
	private String name;
	private int age;

	// 생성자
	public Diff(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//compareTo() 메소드 재정의
	@Override
	public int compareTo(Diff o) {

		// age 필드값과 파라미터 값을 비교하고 싶으니까
		// 나이순으로 정렬
		// return this.age - o.age;

		// 이름순으로 정렬
		// return this.name.compareTo(o.name);

		// 나이가 같은 경우 이름순으로 정렬하도록
		int ageDifferent = this.age - o.age;

		if (ageDifferent == 0) {
			return this.name.compareTo(o.name);
		}
		return ageDifferent;
	}


	// Getter와 Setter
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

	// toString() 메소드 재정의
	@Override
	public String toString() {
		return "Diff [name=" + name + ", age=" + age + "]";
	}

}