package ch04.lecture.p03while;

public class C02While {
	public static void main(String[] args) {
		System.out.println("이전 실행문..");
		
		int i = 0; //변수 초기화
		while(i < 3) { //loop방지를 위한 조건설정
			System.out.println("세 번만 실행되게 하고싶다.");
			i++;
		}
		System.out.println("다음 실행문..");
	}
}
