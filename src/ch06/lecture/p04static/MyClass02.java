package ch06.lecture.p04static;

public class MyClass02 {
	
	// static field(class가 가지고 있는 field)(class field or class variable)
	// class field : 인스턴스 없이 클래스를 통해서 사용할 수 있다
	static String name;
	static int age;
	
	//static method(class가 가지고 있는 method)
	static void greeting() {
		System.out.println(age + "세 " + name + "입니다.");
	}
}
