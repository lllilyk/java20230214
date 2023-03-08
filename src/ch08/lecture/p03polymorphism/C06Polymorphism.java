package ch08.lecture.p03polymorphism;

public class C06Polymorphism {
	public static void main(String[] args) {
		MyInterface06 o1 = method();
	}
	
	// public static 다음에 void, int, String 같이 타입이 오는데 (class명이나) interface명을 타입으로 선언 가능
	// 이 경우에 return값은 해당 interface를 구현한 클래스의 값은 모두 올 수 있음
	public static MyInterface06 method() {
		//return new MyClass06();
		return new MyClass07();
		//return new MyInterface06();
	}
}
	

interface MyInterface06{}
class MyClass06 implements MyInterface06 {}
class MyClass07 implements MyInterface06 {}