package ch08.lecture.p01interface;

public class C01Interface {
	public static void main(String[] args) {
		MyClass01 o1 = new MyClass01();
		
		//인터페이스 구현 클래스(자식)는 인터페이스(부모)가 될 수 있음
		MyInterface01 o2 = o1; //MyClass01은 MyInterface01이다.
		MyInterface02 o3 = o1;
		
		//인터페이스(부모)는 인터페이스 구현 클래스(자식)가 될 수 없음
		//MyClass01 o4 = o2; //거꾸로는 안됨 MyInterface01은 MyClass01이다.
		//MyClass01 o5 = o3; //거꾸로는 안됨!
	}
}
