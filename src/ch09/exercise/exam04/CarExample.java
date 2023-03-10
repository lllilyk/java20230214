package ch09.exercise.exam04;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		Car.Tire tire = myCar.new Tire(); //Car 인스턴스 생성 필요
		
		Car.Engine engine = new Car.Engine(); //Car 인스턴스 생성 없이 접근 가능
	}
}
