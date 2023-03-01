package ch06.lecture.p05this;

public class p250 {
	//인스턴스 필드와 메소드 선언
	int field1;
	void method1(int i) {};
	
	//정적 필드와 메소드 선언
	static int field2;
	static void method2() {};
	
	//정적 블록 선언
	static {
		//field1 = 10;
		//method1();
		field2 = 10;
		method2();
	}
	
	//정적 메소드 선언
	static void method3() {
		
		//this.field1 = 10;
		//this.method1();
		
		field2 = 10;
		method2();
	}
	
	static void method4() {
		
		p250 solution = new p250();
		
		solution.field1 = 10;
		solution.method1(3);
	}
	
	
	
}
