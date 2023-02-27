package ch06.lecture.p01class;

public class C01Class {
	public static void main(String[] args) {
		// 변수에 참조값을 담으면 다음 코드에 적용가능
		MyClass01 var1 = new MyClass01();
		MyClass01 var2 = new MyClass01(); // new 연산자를 사용했으므로 다른 공간에 저장. var1과 다른 인스턴스 생성
		
//		String var2 = new String("hello");
	}
}

