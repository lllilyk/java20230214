package ch15.lecture.p02collections;

import java.util.*;

public class C02Compare {
	public static void main(String[] args) {
		List<Person02> list1 = List.of(
				new Person02("seo", 17),
				new Person02("song", 18),
				new Person02("jung", 19));
		List<Person02> list2 = new ArrayList<>(list1);
		
		//Comparator.compare 메소드
		//다음 세 개중 하나의 값 리턴
		//음수 : 첫 번째 매개값이 작은 경우
		//0 : 두 값이 같은 경우
		//양수 : 첫 번째 매개값이 큰 경우
		
		
		//나이 순 정렬(asc)
		//compare 메소드는 파라미터 두 개를 필요로 하는 메소드이기 때문에 a와 b라는 파라미터 넣어줌
		//list2의 list들을 순서대로 a, b에 넣어서 서로 비교시켜서 최대값 산출
		// -> 화살표 연산자 다음은 메소드의 body{} 부분
		Person02 maxAge = Collections.max(list2, (a, b) -> a.getAge() - b.getAge());
		System.out.println(maxAge);
		System.out.println(list2);

		Person02 minAge = Collections.min(list2, (a, b) -> a.getAge() - b.getAge());
		System.out.println(minAge);
		
		System.out.println(list2);
		
		Collections.sort(list2, (y, m) -> y.getAge() - m.getAge());
		System.out.println(list2);
		
		//이름 순 정렬(asc)
//		Collections.sort(list2, (y, m) -> y.getName() - m.getName()); //string은 - 연산자 사용 불가
		
		//compareTo메소드 - 재정의 시 반드시 return문과 만나게 해주기
		//두 String을 유니코드 순으로 비교해서 int로 결과 산출
		//0 : 두 스트링이 같은 경우
		//음수 : 두번째 스트링이 작은 경우
		//양수 : 두 번째 스트링이 큰 경우
		Collections.sort(list2, (y, m) -> y.getName().compareTo(m.getName()));
		System.out.println(list2);
	}
}

class Person02 {
	//필드
	private String name;
	private int age;
	
	//생성자
	public Person02(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//toString() 메소드 재정의
	@Override
	public String toString() {
		return "Person02 [name=" + name + ", age=" + age + "]";
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
	
}