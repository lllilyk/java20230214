package ch06.sec08.exam02;

public class Computer {
	//가변길이 매개변수를 갖는 메소드 선언
	int sum(int...values) { //int 타입의 파라미터를 n개받는 가변
		//sum 변수 선언
		int sum = 0;
		
		//values는 배열 타입의 변수처럼 사용
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		
		//합산 결과를 리턴
		return sum;
	}
}
