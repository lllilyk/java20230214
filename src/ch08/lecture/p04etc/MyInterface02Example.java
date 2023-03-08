package ch08.lecture.p04etc;

public class MyInterface02Example {
	public static void main(String[] args) {
		//정적 메소드가 아니기 때문에
		//인터페이스 변수 선언과 구현 객체 대입이 필요
		MyInterface02 my = new C02PrivateMethod();
		
		my.method1();
		my.method2();
	}
	
}
