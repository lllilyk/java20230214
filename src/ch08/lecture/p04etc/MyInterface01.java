package ch08.lecture.p04etc;

public interface MyInterface01 {
	void method1();
	
	//default method : interface의 구현된 메소드
	//완전한 실행코드를 가진 메소드
	//구현 클래스에서 메소드를 재정의할 필요x
	//재정의 가능3
	//접근 제한자 생략하면 public
	default void method2() {
		System.out.println("interface의 default method");
		System.out.println("body가 있는 메소드"); 
	}
}
