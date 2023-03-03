package ch06.lecture.p10access;

import ch06.lecture.p10access.package1.*;

public class C03AccessModifier {
	public static void main(String[] args) {
		MyClass03 o1 = new MyClass03();
		//MyClass03 o2 = new MyClass03(6); //private 접근제한 생성자이므로 다른 클래스에서 접근 불가

		
		//package private 접근제한 메소드라서 패키지가 다르므로 접근 불가
		//MyClass03 o3 = new MyClass03("hello"); 
	}
}
