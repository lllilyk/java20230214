package ch06.sec08.exam01;

public class C07Overloading {
	public static void main(String[] args) {
		MyClass07 o1 = new MyClass07();
		
		o1.method1(9);
		o1.method1(29834L);
		o1.method(33, 99);
		o1.method1(3,"hello");
		o1.method("java", 0);
	}
}
