package ch06.lecture.p07constructor;

public class C06Constructor {
	public static void main(String[] args) {
		MyClass06 o1 = new MyClass06("son", 77);
		
		//개발자가 명시적으로 선언한 생성자가 있으면
		//기본 생성자를 생성하지 않으므로 오류
		//MyClass06 o2 = new MyClass06();
	}
}
