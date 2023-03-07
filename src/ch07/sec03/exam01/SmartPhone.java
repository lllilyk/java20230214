package ch07.sec03.exam01;

public class SmartPhone extends Phone{
	//자식 생성자 선언
	public SmartPhone(String model, String color) {
		//부모 클래스인 Phone의 필드가 private이므로 
		//상속을 받은 SmartPhone클래스에서도 접근 불가
		//따라서 this.를 이용해서 읽거나 변경할 수 없음
		
		//매개값의 타입과 개수가 일치하는 부모생성자 호출
		super(model, color);
		System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
	}
}
