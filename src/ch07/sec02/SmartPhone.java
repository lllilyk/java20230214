package ch07.sec02;

public class SmartPhone extends Phone {
	
	//Phone에서 상속받았기 때문에 
	//model, color 필드를 가지고 있음
	
	//필드 선언
	public boolean wifi; //boolean 필드의 초기값은 false
	
	//생성자 선언
	public SmartPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	//Phone에서 상속받았기 때문에
	//bell(), sendVoice(), receiveVoice(), hangUp() 메소드를 가지고 있음
	
	//메소드 선언
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다.");
	}
	
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}
}
