package ch07.sec10.exam01;

public class PhoneExample {
	public static void main(String[] args) {
		//Phone phone = new Phone();
		
		Smartphone smartphone = new Smartphone("홍길동");
		
		smartphone.turnOn();
		smartphone.internetSearch();
		smartphone.turnOff();
		
		Phone p = smartphone;
		p.turnOff();
		p.turnOn();
		//p.internetSearch(); //x
	}
}
