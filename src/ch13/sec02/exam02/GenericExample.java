package ch13.sec02.exam02;

public class GenericExample{
	public static void main(String[] args) {
		HomeAgency homeAgency = new HomeAgency(); //새로운 homeAgency객체 생성
		Home home = homeAgency.rent(); //home 변수에 대입
		home.turnOnLight(); //새로 생성된 home객체의 메소드 실행
		
		CarAgency carAgency = new CarAgency(); //새로운 carAgency객체생성
		Car car = carAgency.rent(); //car 변수에 대입
		car.run(); //새로 생성된 car객체의 메소드 실행
	}
}
