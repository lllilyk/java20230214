package ch08.lecture.p04etc;

public interface MyInterface03 {
	
	//인터페이스에 선언된 필드는 모두 
	//public static final 특성을 가짐
	//public static final을 생략하더라도 
	//컴파일 과정에서 자동으로 붙음
	
	// static field
	public static int I = 3;
	
	//public static final 생략
	//final 이니까 초기값 선언
	int J = 5;
	String MY_HOME = "seoul";

}
