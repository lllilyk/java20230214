package ch07.lecture.p01inheritance;

public class SubClass04 extends SuperClass04{
	
	@Override //재정의 메소드인지 컴파일러가 검증
	public void method1() {
		//재정의할 목적
		System.out.println("sub method1");
	}
	
	//ctrl + space
	//힌트를 얻을 수 있음
	@Override // : 어노테이션(annotation)
	public void method2() {
		// TODO Auto-generated method stub
		super.method2();
	}
}
