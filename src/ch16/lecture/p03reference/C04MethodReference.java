package ch16.lecture.p03reference;

public class C04MethodReference {
	public static void main(String[] args) {
		//instance method reference
		//static 처럼 생겼는데 아님
		//Reference to an instance method
		//of an arbitrary object of a particular type
		
		//실행클래스에서 인터페이스의 메소드 재정의
		
		MyInterface05 o1 = (a, b) -> a.method(b);
		MyInterface05 o2 = MyClass04::method;
		
		//MyClass04 타입을 넣어줘야 하니까 MyClass04 객체 넣어주기
		o2.action(new MyClass04(), 3);
	}
}

 
// 재정의를 쉽게 하기 위해서 파라미터 타입으로 클래스 넣는 경우도 있음

interface MyInterface05 {
	void action(MyClass04 a, int b);
}

class MyClass04 {
	void method(int a) {
		System.out.println("오잉");
	}
}