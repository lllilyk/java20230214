package ch09.sec02.exam01;

public class AExample {
	public static void main(String[] args) {
		//A객체 생성
		A a = new A(); //먼저 클래스의 인스턴스 생성 후
		
		//B객체 생성
		A.B b = a.new B(); //중첩 클래스의 인스턴스 생성 가능
	}
}
