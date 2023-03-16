package ch15.sec05.exam03;

public class Person implements Comparable<Person>{ //Comparable 인터페이스 구현
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Person o) { //compareTo() 메소드 재정의 필요
		if(age<o.age) return -1;
		else if(age == o.age) return 0;
		else return 1;
	}  
}
