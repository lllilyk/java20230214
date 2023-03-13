package ch09.sec07.exam02;

public class Home {
	//private RemoteControl rc라는 필드에 
	//new RemoteControl(){}; 이라는 익명 구현 객체 대입
	
	private RemoteControl rc = new RemoteControl() {
		@Override //추상 메소드이므로 재정의
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
		};
	
	//메소드(필드 이용)
	public void use1() {
		rc.turnOn();
		rc.turnOff();
	}
	
	//메소드(로컬 변수 이용)
	//메소드 안에 익명객체 생성
	public void use2() {
		RemoteControl rc = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("에어컨을 켭니다.");
			}
			@Override
			public void turnOff() {
				System.out.println("에어컨을 끕니다.");
			}
		};
		rc.turnOn();
		rc.turnOff();
	}
	
	//메소드(매개변수 이용)
	//rc라는 필드가 Home 클래스 안에 선언되어 있으므로 Home클래스 안에서는 어디서나 이용 가능
	public void use3(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
}
