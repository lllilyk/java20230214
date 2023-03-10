package ch13.lecture.p01generic;

public class C06GenericMethod {
	public static void main(String[] args) {
		MyClass06 o1 = new MyClass06();
		o1.<String>method();
		o1.<Integer>method();
		
		String s1 = o1.<String>method();
		Integer s2 = o1.<Integer>method();
		String s3 = o1.method();
		Integer s4 = o1.method(); //s4앞 타입을 보고 유추가 가능하니까 생략가능
	}
}

class MyClass06 {
	public <T> T method() { //public <타입 파라미터 정의> 리턴타입 method(){...}
		return null;
	}
}
