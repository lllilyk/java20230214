package ch07.lecture.p01inheritance;

public class SubClass03 extends SuperClass03{

	//method1, method2 상속받음
	//필요하면 상속받은 메소드를 변경해서 사용가능
	
	//상속받은 method는 재정의(Override) 가능
	public void method2() {
		System.out.println("서브클래스 메소드2");
	}
	
	public void method3() {
		System.out.println("서브클래스 메소드3");
	}
}
