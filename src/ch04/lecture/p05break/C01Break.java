package ch04.lecture.p05break;

public class C01Break {
	public static void main(String[] args) {
		// break
		// 반복문(for, while, do while) 종료
		
		while (true) {
			System.out.println("코드 반복1");
			System.out.println("코드 반복2");
			
			if(true) {
			break;
			}
			
//			System.out.println("코드 반복3"); //break를 만나면 while문을 나가기 때문에 오류 발생
//			System.out.println("코드 반복4");
		}
		System.out.println("다음 실행 코드들...");
	}
}
