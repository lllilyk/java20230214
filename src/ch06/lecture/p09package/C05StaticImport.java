package ch06.lecture.p09package;

import ch06.lecture.p09package.package1.MyClass05;

//사용시 주의

// static import
// : static 멤버(field, method)
import static ch06.lecture.p09package.package1.MyClass05.name;
import static ch06.lecture.p09package.package1.MyClass05.method1;
import static ch06.lecture.p09package.package1.MyClass05.method2;

public class C05StaticImport {
	public static void main(String[] args) {
		//String n = MyClass05.name;
		//9번째 줄의 static import로 클래스명 생략 가능
		String n = name;
		
		//MyClass05.method1();
		//10번째 줄의 static import로 클래스명 생략 가능
		method1();
		method2();
	}
}
