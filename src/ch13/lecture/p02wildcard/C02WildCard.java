package ch13.lecture.p02wildcard;

public class C02WildCard {
	public static void main(String[] args) {
//		MyClass02<Object> o1 = new MyClass02<String>(); //x
//		o1.item = new String();
				
		//String의 상위타입이기만 하면 ok
		//값이 나갈 때(out)는 super
		//
		MyClass02<? super String> o1 = new MyClass02<String>(); 
		o1.item = new String(); // String 또는 그 하위타입 대입 가능
		
		//o1의 item을 String으로 꺼내고 싶다.
//		String s1 = o1.item;
		// String에 할당 불가
		//(String또는 그 하위타입) != String
		// 따라서 꺼내는 것은 불가능		
		
		//값이 들어올 때(in)는 extends
		MyClass02<? extends String> o2 = new MyClass02<String>(); 
//		o2.item = new String(); //String 또는 그 하위타입을 대입 불가능
		String s2 = o2.item; //o2.item이 String의 하위타입이면 꺼내는 것이 가능
	}
}

class MyClass02<T>{
	public T item;
}
