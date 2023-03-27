package ch11.lecture.p04throw;

public class C07Throw {
	public static void main(String[] args) {
		//method1();
		//메소드를 호출하는 곳에서는 꼭 try-catch block 만들어주기
		
		try {
			method1();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void method1() throws ClassNotFoundException {
		
	}
}
