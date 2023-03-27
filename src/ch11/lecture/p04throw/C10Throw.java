package ch11.lecture.p04throw;

public class C10Throw {
	public static void main(String[] args) throws ClassNotFoundException {
		method2();
	}
	
	//잡지 않으면 던질 수 있음
	public static void method2() throws ClassNotFoundException{
		method1();
	}
	
	public static void method1() throws ClassNotFoundException{
		
	}
}
