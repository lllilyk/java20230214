package ch16.lecture.p03reference;

public class C02MethodReference {
	public static void main(String[] args) {
		MyInterface02 o1 = () -> MyClass02.method1();
		MyInterface02 o2 = MyClass02::method1;
		
		MyInterface03 o3 = (a, b) -> MyClass02.method2(a, b);
		MyInterface03 o4 = MyClass02::method2;
		
		MyInterface03 o5 = (a, b) -> MyClass02.method1();
//		MyInterface03 o6 = MyClass02::method1;//x 
		//파라미터 개수가 같을 경우에만 생략 가능
		
		MyInterface03 o7 = (a, b) -> MyClass02.method2(b, a);
		//파라미터 순서가 다르므로 생략하면 안됨
		
		MyInterface03 o8 = MyClass02::method2;
	}
}

interface MyInterface02 {
	void action();
}

interface MyInterface03 {
	void action(int a, int b);
}

class MyClass02 {
	public static void method1() {
		
	}
	
	public static void method2(int a, int b) {
		
	}
}
