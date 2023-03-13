package ch09.lecture.p02anonymous;

public class C01Anonymous {
	
	//익명객체는 그 중 파라미터(매개변수)로 가장 많이 사용됨
	//필드, 매개변수, 로컬 변수의 초기값으로 주로 사용됨
	
	public static void main(String[] args) {
		MyClass01 o1 = new SubClass01();
	}
}

class MyClass01 {
	
}

class SubClass01 extends MyClass01 {
	//클래스 구현
}
