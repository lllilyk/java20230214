package ch11.lecture.p02try_catch;

public class C07MultipleException {
	public static void main(String[] args) {
		try {			
			int[] a = {0, 1};
			
			//ArithmeticException
			//ArrayIndexOutOfBoundsException
			//이 두 exception은 상위타입인 RuntimeException에 속함
			int c = 3 / a[0];
			
			//object x
			//throwable까지 가능
		} catch (Throwable e) {
			e.printStackTrace(); //실제 인스턴스의 메소드가 실행됨
		}
		System.out.println("continue...");
	}
}