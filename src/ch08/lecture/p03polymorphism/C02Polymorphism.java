package ch08.lecture.p03polymorphism;

// 인터페이스 타입의 구현클래스를 매개값으로 받아서 메소드를 실행시킬 수 있음

public class C02Polymorphism {
	public static void main(String[] args) {
		method(new MyClass01());
		method(new MyClass02());
	}
	
	public static void method(MyInterface01 param) {
		//param의 메소드 실행 가능
	}
}
