package ch06.lecture.p08static;

public class MyClass01 {
	//필드
	
	//인스턴스 필드
	String name;
	
	//정적(static) 필드
	static String company = "kia";
	
	
	//생성자 : (주로)인스턴스 필드 초기화
	MyClass01(){
		name = "son";
	}
	
	//static initialization block : (주로)정적 필드 초기화
	//정적초기화블럭
	static {
		//명령문들
		company = "samsung";
	}
	
	
}
