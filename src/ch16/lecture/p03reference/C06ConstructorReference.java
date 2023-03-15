package ch16.lecture.p03reference;

public class C06ConstructorReference {
	// 생성자 참조
	// Reference to a constructor

	public static void main(String[] args) {
		MyInterface07 o1 = () -> {
			return new MyClass07();
		};
	}
		MyInterface07 o2 = () -> new MyClass07(); //파라미터가 일치하기만 하면 ok 둘다 없으니까 ok
		MyInterface07 o3 = MyClass07::new; //생성자 참조
		
		MyInterface08 o4 = (a) -> new MyClass07(a);
		MyInterface08 o5 = MyClass07::new; //파라미터의 순서와 개수가 일치하면 ok
}

interface MyInterface07 {
	MyClass07 action();
}

interface MyInterface08 { 
	MyClass07 action(int a);
}

class MyClass07 {
	
	MyClass07(){
		
	}
	
	MyClass07(int a){
		
	}
}
