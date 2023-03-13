package ch16.lecture.p02lambda;

public class C03Lambda {
	public static void main(String[] args) {
		MyInterface03 o1 = new MyInterface03() {
			@Override
			public void method(int a) {
				System.out.println("익명클래스로 재정의");
				System.out.println("받은 값: " + a);
			}
		};
		o1.method(9);
		
		MyInterface03 o2 = (int a) -> { 
			//메소드 몸통은 생략불가
			System.out.println("익명클래스로 재정의");
			System.out.println("받은 값: " + a);
		};
		o2.method(10);
		
		//파라미터 타입(int) 생략 가능
		MyInterface03 o3 = (a) -> {
			System.out.println("파라미터 타입 생략");
			System.out.println("받은 값: " + a);
		};
		o3.method(30);
		
		//파라미터가 하나인 경우 () 생략 가능
		MyInterface03 o4 = a -> {
			System.out.println("파라미터 타입 생략");
			System.out.println("받은 값: " + a);
		};
		o4.method(40);
		
		MyInterface03 o5 = x -> {
			System.out.println("파라미터명 정의");
			System.out.println("받은 값:" + x); //FunctionalInterface의 추상메소드의 파라미터와 꼭 이름이 같을 필요는 없음
		};
		o5.method(40);
		
		MyInterface03 o6 = x -> System.out.println("받은 값: " + x);
		o6.method(50);
	}
}

@FunctionalInterface
interface MyInterface03 {
	void method(int a);
}
