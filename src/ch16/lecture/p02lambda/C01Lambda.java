package ch16.lecture.p02lambda;

public class C01Lambda {
	public static void main(String[] args) {
		//functional interface로 lambda 식 만들 수 있음
		MyInterface01 o1 = () -> System.out.println("재정의 메소드@");
		o1.method1();
		
		MyInterface01 o2 = () -> System.out.println("또 다른 메소드@");
		o2.method1();
	}
}

// lambda expression
// 추상 메소드가 하나인 interface : functional interface
// 다른 메소드가 있거나 없거나 추상 메소드가 하나이기만 하면 functional interface

// functional interface의 익명클래스 객체 만드는 코드

@FunctionalInterface // functional interface인지 아닌지 자바 컴파일러가 검증 //써도 되고 안써도됨
interface MyInterface01 {
	void method1();
	
	String toString(); //추상 메소드가 2개인 것 같지만 아님 //Object에 있는 메소드는 추상메소드 수에 포함x
	
	default void method2() {
		
	}
	
	static void method3() {
		
	}
	
}
