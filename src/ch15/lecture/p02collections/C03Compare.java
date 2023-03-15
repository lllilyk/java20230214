package ch15.lecture.p02collections;

import java.util.*;

public class C03Compare {
	public static void main(String[] args) {
		List<Person03> list = new ArrayList<>();
		list.add(new Person03("cha", 50));
		list.add(new Person03("son", 30));
		list.add(new Person03("park", 40));
		list.add(new Person03("kim", 40));

		System.out.println(list);

		Collections.sort(list);

		System.out.println(list);
	}
}

// interface Comparable<T>
//Type Parameters:
//T - the type of objects that this object may be compared to

class Person03 implements Comparable<Person03> { // 인터페이스를 구현할 때는 추상메소드를 꼭 재정의
	private String name;
	private int age;

	@Override
	public String toString() {
		return "Person03 [name=" + name + ", age=" + age + "]";
	}

	
	//compareTo 메소드
	//public int compareTo(String anotherString)
	
	@Override
	public int compareTo(Person03 o) { //재정의하는 경우 반드시 return문 만나게 해주기

		// 나이순
		// return this.age - o.age;

		// 이름순
		// return this.name.compareTo(o.name);

		int ageDiff = this.age - o.age;

		if (ageDiff == 0) {
			return this.name.compareTo(o.name);
		}

		return ageDiff;
	}

	//constructor
	public Person03(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	//getter & setter
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

}