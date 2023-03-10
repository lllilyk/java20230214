package ch09.lecture.p01nested;

public class C02NestedClass {
	public static void main(String[] args) {
		
	}
}

class MyClass02 {
	class Nested02 {
		
	}
	
	Nested02 item = new Nested02(); //중첩클래스를 필드
	
	void method1() {
		Nested02 local = new Nested02(); //와 메소드에서 자유롭게 사용 가능 + 생성자까지
	}
}