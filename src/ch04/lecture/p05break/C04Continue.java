package ch04.lecture.p05break;

public class C04Continue {
	public static void main(String[] args) {
		
		for(int i = 0; i < 500; i++) {
			System.out.println("실행코드1");
			
			if(true) {
				continue; //반복문 안의 다음 코드를 실행하지 않고 다시 증감식 > 조건식 > 실행문 순으로 반복
			}
			System.out.println("실행코드2");
		}
	}
}