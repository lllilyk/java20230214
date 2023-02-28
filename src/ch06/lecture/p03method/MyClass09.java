package ch06.lecture.p03method;

public class MyClass09 {
	void method1() {
		System.out.println("파라미터 없는 메소드");
	}
	
	void method1(int i) {
		System.out.println("파라미터 하나 받는 메소드");
	}
	
	void method1(int i, int j) {
		System.out.println("파라미터 두 개 받는 메소드");
	}
	
	
	// 파라미터 몇 개 받을지 모르는 경우
	void method2(int[] args) {
		for(int arg : args) {
			System.out.println("받은 파라미터:" + arg);
		}
	}
	
	// 가변길이 아규먼트 (varargs)
	void method3(int...args) {
		// args를 배열로 사용
		for(int arg : args) {
			System.out.println("가변길이 파라미터: " + arg);
		}
	}
	
	
	//다른 타입의 변수도 섞여있는 경우 
	//가변길이매개변수는 파라미터 목록에서 가장 오른쪽에 작성)
	void method4(String param, double d, int...values) { 
		
	}
	
	
}
