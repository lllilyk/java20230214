package ch09.lecture.p01nested;

public class C03StaticNestedClass {
	public static void main(String[] args) {
		MyClass03.Nested03 o1 = new MyClass03.Nested03();
		// 정적 클래스는 인스턴스 따로 생성할 필요 없이 클래스명으로 바로 접근 가능
	}
}

class MyClass03 {
	//static nested(member) class
	//정적 멤버 클래스
	static class Nested03 {
		
	}
}