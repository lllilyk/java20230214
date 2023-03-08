package ch08.lecture.p03polymorphism;

// 인터페이스로 배열 인스턴스를 생성하는 것도 가능

public class C03Polymorphism {
	public static void main(String[] args) {
		MyInterface03[] arr = new MyInterface03[5];
		arr[0] = new MyClass03();
		arr[1] = new MyClass03();
		arr[2] = new MyClass03();
		arr[3] = new MyClass03();
		arr[4] = new MyClass03();
	}
}
interface MyInterface03 {}
class MyClass03 implements MyInterface03 {}
class MyClass04 implements MyInterface03 {}
