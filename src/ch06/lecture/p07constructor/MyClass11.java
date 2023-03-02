package ch06.lecture.p07constructor;

public class MyClass11 {
	final String name = "son"; //필드 선언시 초기화
	final int age; //생성자에서 값 할당해야함
	
	MyClass11(){
		this(99);
	}
	
	MyClass11(int age){
		this.age = age; //파라미터로 받은 값을 넣어주려는 목적이니까 이름 같게
	}
}
