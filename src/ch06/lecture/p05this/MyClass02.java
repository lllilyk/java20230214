package ch06.lecture.p05this;

public class MyClass02 {
	// 특별히 this를 쓰는 경우
	
	// instance field
	String name;
	
	// instance method
	void printName() {
		String name = "park";
		
		System.out.println(name);      // local variable을 가리킴
		System.out.println(this.name); //instance field를 가리킴
	}
	
	void setName(String name) {
		// 파라미터 name을 필드 name에 할당
		this.name = name;
	}
	
}
