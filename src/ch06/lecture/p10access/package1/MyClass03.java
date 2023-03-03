package ch06.lecture.p10access.package1;

public class MyClass03 {

	//public 생성자 : 어디서든 접근 가능
	public MyClass03(){
		
	}
	
	//private 생성자 : 클래스 내에서만 접근 가능
	private MyClass03(int i){
		
	}
	
	//package private 생성자 : 같은 패키지 내에서만 접근 가능
	//package private(default)
	MyClass03(String s){
		this(9);
	}
	
	//public 메소드
	public void method() {
		MyClass03 o1 = new MyClass03(3); //같은 클래스 내 이므로 접근 가능
	}
	
}
