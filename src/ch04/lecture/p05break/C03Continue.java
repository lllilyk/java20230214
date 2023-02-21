package ch04.lecture.p05break;

public class C03Continue {
	public static void main(String[] args) {
		while(true) {
			System.out.println("실행문1");
			
			if(true) {
			continue; // 더 이상 실행되지 않고 다시 조건을 확인.
			}
			
			System.out.println("실행문2");
		}
		
	}
}
