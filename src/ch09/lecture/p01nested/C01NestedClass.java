package ch09.lecture.p01nested;

public class C01NestedClass {

	public static void main(String[] args) { 
	
	MyClass01 o1 = new MyClass01(); 
	//먼저 MyClass01의 인스턴스 만들고 
	o1.new Nested01(); // 그 다음에 중첩 클래스 인스턴스 만들기
	//MyClass01.Nested01 o2 = o1.new Nested01();
	}
}

// 정적 클래스가 아니므로 인스턴스 생성없이 이름으로 바로 접근 불가
/*
 * public static void main(String[] args) { MyClass01.Nested01 o1 = new
 * MyClass01.Nested01(); o1.Method1(); }
 */

// 중첩 클래스(nested class)
class MyClass01 {
	// class
	class Nested01 {
		// 필드
		// 생성자
		// 메소드
		public void Method1() {
			System.out.println("중첩 클래스의 메소드");
		}

	}

	// 필드
	// 생성자
	// 메소드

}