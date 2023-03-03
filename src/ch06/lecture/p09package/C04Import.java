package ch06.lecture.p09package;

import ch06.lecture.p09package.package1.*;
//import ch06.lecture.p09package.package2.MyClass04; //같은 이름의 파일은 같이 import불가

public class C04Import {
	public static void main(String[] args) {
		MyClass04 o1 = new MyClass04();
		
		//MyClass04 o2 = new MyClass04();
		
		//많이 있는 일은 아니지만 이런일이 있을경우에는 이렇게 둘 중 하나를 풀네임으로 작성해서 구분해줘야함.
		
		ch06.lecture.p09package.package2.MyClass04 o2 = new ch06.lecture.p09package.package2.MyClass04();
	}
}
