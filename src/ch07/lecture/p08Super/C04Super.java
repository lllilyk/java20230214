package ch07.lecture.p08Super;

public class C04Super {
	public static void main(String[] args) {
		Sub04 a = new Sub04();
		a.method3();
	}
}

class Super04 {
	public void method1() {
		
	}
	public void method3() {
		
	}
}

class Sub04 extends Super04{
	@Override
	public void method3() {
		method1();
		//method3(); //자기 자신
		//명시적으로 사용
		//자신의 메소드를 의미하는건지 부모클래스의 메소드를 의미하는지 불명확
		super.method3(); //부모 클래스의 method3을 호출하고 싶을때
	}
	
	public void method2() {
		method1(); //가능 자식은 부모다(O)
	}
}
