package ch08.sec02;

public class Television implements RemoteControl{
	//RemoteControl 인터페이스가 가지고 있는 메소드를 
	//반드시 재정의해줘야함
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
}
