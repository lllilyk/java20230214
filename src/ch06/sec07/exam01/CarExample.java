package ch06.sec07.exam01;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car("그랜져", "검정", 250);
		//Car myCar = new Car(); //기본 생성자 호출 못함
		//클래스에 개발자가 선언한 생성자가 있는 경우,
		//컴파일러는 기본 생성자를 추가하지 않기 때문
	}
}
