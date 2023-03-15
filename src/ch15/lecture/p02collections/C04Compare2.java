package ch15.lecture.p02collections;

import java.util.*;

public class C04Compare2 {
	public static void main(String[] args) {
		var list = new ArrayList<Person00>();
		list.add(new Person00("kang", "20230315"));
		list.add(new Person00("seo", "20221203"));
		list.add(new Person00("chae", "20020605"));
		list.add(new Person00("song", "20121203"));
		list.add(new Person00("jung", "20210707"));
		
		//나이순 정렬(나이가 어릴수록 작은 index에)
		//Collections.sort(list); //C03Compare
		Collections.sort(list);

	}
}

class Person00 implements Comparable<Person00>{
	private String name;
	private String birth;
	
	// toString
	@Override
	public String toString() {
		return "Person00 [name=" + name + ", birth=" + birth + "]";
	}

	-----------------------다시---------------------------
	@Override
	public int compareTo(Person00 o) {
		return 0;
		}
	
	//constructor 
	public Person00(String name, String birth) {
		super();
		this.name = name;
		this.birth = birth;
	}

	//getters&setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}
}