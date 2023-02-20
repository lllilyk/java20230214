package ch04.sec02;

public class IfExample {
	public static void main(String[] args) {
		int score = 93;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다");
		}
		
		if(score < 90) //{}생략
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다."); //IF문과는 상관없는 실행문
			// 이렇게 헷갈릴 수 있으니 {}생략하지 말 것 
	
	}
}
