package ch16.lecture.p03reference;

public class C03MethodReference {
	public static void main(String[] args) {
		//instance method reference
		//Reference to an instance method of a particular object
		
		/*
		MyInterface04 o1 = new MyInterface04() {
			@Override
			public void action(int a) {
				System.out.println(a);
			}
		};
		*/
		
		MyInterface04 o1 = a -> System.out.println(a);
		
		MyClass03 s1 = new MyClass03();
		MyInterface04 o2 = a -> s1.method(a);
		MyInterface04 o3 = s1::method; //8번째 코드랑 같은 코드
		//파라미터가 없을 때 있을 때 2개 있을때 상관없이 다 사용 가능

		MyInterface02 o4 = () -> s1.method1();
		MyInterface02 o5 = s1::method1;
		
		MyInterface03 o6 = (a, b) -> s1.method2(a, b);
		MyInterface03 o7 = s1::method2;
		
		MyInterface03 o8 = (a, b) -> s1.method2(b, a);
	}
}

interface MyInterface04 {
	void action(int a);
}

class MyClass03 {
	void method1() {
	}
	
	void method2(int a, int b) {
	}
	
	void method(int a) {
		
	}
}
