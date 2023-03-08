package ch08.lecture.p04etc;

public interface MyInterface05 {
	//public static final field
	
	//public static method
	static void method1() {
		common();
		System.out.println("method1 code...");
	}
	static void method2() {
		common();
		System.out.println("method2 code...");
	}
	//안쓰면 public인데 외부에서 접근 못하도록 private선언
	//private static method
	private static void common() {
		System.out.println("공통된 코드");
	}
	
	//public abstract instance method
	//public default instance method
	//private instance method
}
