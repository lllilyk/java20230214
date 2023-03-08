package ch08.lecture.p05cast;

public class C01Cast {
	public static void main(String[] args) {
		MyInterface01 o1 = new  MyClass011();
		//o1.method1();//xx 
		//인터페이스 입장에서는 method1이 없으니까호출불가
	
		//강제 형변환
		MyClass011 o2 = (MyClass011) o1;
		
		//method1();
	}
}
