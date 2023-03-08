package ch08.lecture.p04etc;

public class C01DefaultMethod {
	public static void main(String[] args) {
		MyInterface01 o1 = new MyClass011();
		MyInterface01 o2 = new MyClass012();
		
		o1.method1();
		o2.method1();
		o1.method2();
		o2.method2(); //default 메소드는 따로 재정의하지 않았어도 사용가능
	}
}
