package ch06.lecture.p03method;

public class MyClass03 {
	// (instance) field
	String name;
	
	
	// (instance) methods
	void greeting() {
		String to = "여러분"; // 변수는 선언된 블럭 안에서 사용 가능
		System.out.println(to + " 안녕하세요.");
		
		System.out.println("저는 " + name + "입니다.");
	}
}
