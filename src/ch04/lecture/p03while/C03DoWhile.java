package ch04.lecture.p03while;

public class C03DoWhile {
	public static void main(String[] args) {
		// do while
		// 코드블럭 실행 후 조건 확인(조건 확인을 먼저하고 코드블럭을 실행하는 while과 반대)
		// 조건이 true이면 코드블럭 실행
		// 반복
		
		System.out.println("이전 명령문..");
		
		boolean con = true; //오류가 뜨지 않게 하려고
		
		do {
			System.out.println("명령문 반복1");
			System.out.println("명령문 반복2");
		}while(con);
			System.out.println("다음 명령문..");
		
		
	}
}
