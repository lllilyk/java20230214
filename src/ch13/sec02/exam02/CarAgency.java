package ch13.sec02.exam02;

public class CarAgency implements Rentable<Car> {
	@Override
	public Car rent() { //rent메소드를 Car타입으로 재정의
		return new Car(); //리턴값은 새로운 Car객체
	}
}
