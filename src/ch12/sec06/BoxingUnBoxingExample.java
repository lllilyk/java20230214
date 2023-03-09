package ch12.sec06;

public class BoxingUnBoxingExample {
	public static void main(String[] args) {
		//Boxing : 클래스 변수에 기본 타입 값이 대입될 때 발생
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());
		
		//UnBoxing : 기본타입 변수에 포장 객체가 대입될 때 발생
		int value = obj;
		System.out.println("value: " + value);
		
		//연산 시 UnBoxing
		int result = obj + 100;
		System.out.println("result: " + result);
	}
}
