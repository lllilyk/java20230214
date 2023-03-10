package ch13.sec02.exam02;

public class HomeAgency implements Rentable<Home> {
	@Override
	public Home rent() { //rent메소드를 Home타입으로 재정의
		return new Home(); //리턴값은 새로운 Home 객체
	}
}
