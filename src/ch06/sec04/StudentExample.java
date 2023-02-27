package ch06.sec04;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student(); //s1객체라고 부름
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student(); //참조값이 new 연산결과로 나온 것. 참조값을 가질 변수s2를 선언하고 변수에 참조값을 담기. s2참조변수(s2객체)가 가리키고 있는 student인스턴트. 
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다. ");
		
		System.out.println(s1 == s2); //false
		
		//참조값(메모리주소)이 궁금할때
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
	}
}
