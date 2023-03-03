package ch06.lecture.p10access.package1;

public class C03AccessModifier {
	public static void main(String[] args) {
		MyClass03 o1 = new MyClass03();
		//MyClass03 o2 = new MyClass03(2); //private이므로 접근 불가
		
		//package private이므로 접근 가능
		MyClass03 o3 = new MyClass03("hello"); 
	}
}
