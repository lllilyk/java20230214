package ch07.lecture.p02polymorphism;

public class C01Polymorphism {
	public static void main(String[] args) {
		SubClass01 o1 = new SubClass01();
		SuperClass01 o2 = o1; 
		//o2의 타입은 SuperClass01 (한교동은 산리오 캐릭터즈에 포함될 수 있음)
		//자동형변환
		//(자식 클래스는 부모 클래스에 할당 가능)
		
		o1.method1();
		o2.method1();
	}
}

class SuperClass01{
	public void method1() {
		System.out.println("super method1");
	}
}

class SubClass01 extends SuperClass01 {
	@Override
	public void method1() {
		System.out.println("sub method1");
	}
}
