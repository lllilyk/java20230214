package ch08.sec09;

public class InterfaceCImp1 implements InterfaceC{
	
	//인터페이스를 구현하기 위해서는 추상메소드 세 개를 모두 재정의해줘야함
	
	public void methodA() {
		System.out.println("InterfaceCImp1-methodA() 실행");
	}
	
	public void methodB() {
		System.out.println("InterfaceCImp1-methodB() 실행");
	}
	
	public void methodC() {
		System.out.println("InterfaceCImp1-methodC() 실행");
	}
}
