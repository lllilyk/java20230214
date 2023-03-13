package ch09.lecture.p02anonymous;

public class C07Anonymous {
	public static void main(String[] args) {
		MyInterface07 o1 = new MyClass07(); //인터페이스는 개념이기 때문에 바로 이렇게 인스턴스 생성하는 것은 불가능
		o1.method1();
	}
}

// 구현 클래스가 먼저!
class MyClass07 implements MyInterface07{
	@Override
	public void method1() {
		System.out.println("재정의된 메소드");
	}
}

interface MyInterface07{
	void method1(); //추상메소드
	
}