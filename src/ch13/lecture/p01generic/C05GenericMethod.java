package ch13.lecture.p01generic;

public class C05GenericMethod {
	public static void main(String[] args) {
		MyClass05 o1 = new MyClass05();
		o1.<String>method("java"); //메소드를 호출할 때 어떤 타입을 할건지 타입 아규먼트 작성해주면 ok
		//파라미터의 타입을 보고 타입 아규먼트를 유추 할 수 있음
		o1.<Integer>method(9);
		o1.method("spring"); // <String> 생략 가능
		o1.method(99);
	}
}

class MyClass05{
	
	//generic method
	public <T> void method(T t) {
		
	}
}