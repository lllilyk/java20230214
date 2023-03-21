package ch11.exercise.exam05;

public class Example05 {
	
	//1
	public static void m1() {
		try {
			method1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//2
	public static void method2() throws Exception {
		method1();
	}
	
	//3
	public static void m3() {
		try {
			method1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) { //도달할 수 없는 코드
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//4
	public static void m4() {
		try {
			method1();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void method1()
		throws NumberFormatException, ClassNotFoundException {
		
	}
}
