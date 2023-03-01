package ch06.sec10.exam01;

public class Calculator {
	static double pi = 3.14159;// pi는 어디서나 동일한 값 3.14159를 가지므로 
	// 객체마다 가지고 있을 필요가 없기때문에 정적 필드로 선언하는 것이 좋음
	
	
	static int plus(int x, int y) {
		return x + y;
	}
	
	// plus 와 minus 메소드의 경우 어차피 외부에서 주어진 매개값을 가지고 처리
	// 인스턴스 멤버를 참조할 필요x
	// 정적 메소드로 선언하는 것이 좋음
	
	static int minus(int x, int y) {
		return x - y;
	}
}

