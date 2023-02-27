package ch06.lecture.p03method;

public class C04Parameter {
	public static void main(String[] args) {
		MyClass04 o1 = new MyClass04();
		o1.method1(); //파라미터가 없는 메소드이기때문에 ()안에 뭐가 있으면 안됨

		//메소드 실행 시 정의된 파라미터 타입과 순서, 개수에 맞춰서
		//아규먼트 입력(전달)
		//o1.method1(3); // 안됨
		
		o1.method2(5); //int 타입의 파라미터를 () 안에 넣어줘야함
		//o1.method2(); // 안됨
		
		o1.method3("hello");
		String s1 = "java";
		o1.method3(s1);
		
		o1.method3(null);//참조타입은 null인 값도 가질 수 있으므로
		
		o1.method4(3, 6);
		
		o1.method5("가나", "가타");
		
		o1.method6(3, null);
		
		o1.method7("happy", 0);
		
		
	}
}
