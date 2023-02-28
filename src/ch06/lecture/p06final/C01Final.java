package ch06.lecture.p06final;

public class C01Final {
	public static void main(String[] args) {
		// final
		// 값을 한 번만 할당할 수 있다는 의미를 가진 키워드
		int a = 3;
		a= 5; //값 변경 가능
		
		final int b = 5;
		//b = 10; // 두 번째 값 할당 불가
	}
	
	static void method(int i) {
		System.out.println(i);
		i = 5;
		System.out.println(i);
	}
	
	
	static void method2(final int i) {
		System.out.println(i);
		//i = 9; //xxx
		System.out.println(i);
	}
}
