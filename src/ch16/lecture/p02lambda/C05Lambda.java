package ch16.lecture.p02lambda;

public class C05Lambda {
	public static void main(String[] args) {
		MyInterface05 o1 = new MyClass05();
		int r1 = o1.method();
		
		MyInterface05 o2 = () -> {
			System.out.println("람다로 메소드 재정의");
			return 3; //return도 실행문이기 때문에 {} 중괄호 생략 불가
		};
		int r2 = o2.method();
		
		MyInterface05 o3 = () -> {
			return 5; //return문 하나만 있으니까 생략가능
		};
		int r3 = o3.method();
		
		MyInterface05 o4 = () -> 5; //하나있는 명령문이 return문이니까 return도 생략
		int r4 = o4.method();
	}
}

class MyClass05 implements MyInterface05{
	@Override
	public int method() {
		System.out.println("명령문 작성...");
		
		return 0; 
	}
}

interface MyInterface05{
	int method(); //리턴 타입이 있음
}