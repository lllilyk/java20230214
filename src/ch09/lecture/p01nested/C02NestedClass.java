package ch09.lecture.p01nested;

public class C02NestedClass {
	public static void main(String[] args) {
		
	}
}

//기존 클래스
class MyClass02 {
	//중첩 클래스
	class Nested02 {
		
	}

	//기존 클래스에 중첩 클래스 인스턴스 생성
	Nested02 item = new Nested02();
	
	//기존클래스의 메소드 안에 중첩 클래스의 새 인스턴스 생성
	void method1() {
		Nested02 local = new Nested02(); //와 메소드에서 자유롭게 사용 가능 + 생성자까지
	}
}