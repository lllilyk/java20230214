package ch07.sec04.exam02;

public class SupersonicAirplaneExample {
	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC; //필드값변경
		sa.fly();//메소드실행
		sa.flyMode = SupersonicAirplane.NORMAL; //필드값변경
		sa.fly();
		sa.land();
	
	
	}
}
