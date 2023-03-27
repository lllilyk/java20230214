package ch11.lecture.p02try_catch;

public class C03PrintStackTrace {
	public static void main(String[] args) {
		try {
			int a = 0;
			int b = 3;
			
			int c = b / a;
			
			System.out.println("try block continue.....");
		} catch (ArithmeticException e) {
			//catch block
			System.out.println("예외 발생!!!");
			e.printStackTrace(); 
			//쓰지 않아도 상관은 없지만 나중에 확인했을 때 예외를 찾기 너무 어려우니까 흔적 꼭 남기기 467p 3가지 방법
		}
		System.out.println("program continue.....");
	}
}
