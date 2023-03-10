package ch13.lecture.p02wildcard;

public class C03WildCard {
	public static void main(String[] args) {
		MyClass03<? super Number> o1 = new MyClass03<Number>();
		MyClass03<? super Number> o2 = new MyClass03<Object>();
		
//		o1.item = new Number(); //ok 추상클래스여서 인스턴스화 못함
		o1.item = new Integer(0); //number의 하위타입이면 모두 가능
//		o1.item = new Object(); //x object는 number다 x
		
		MyClass03<? extends Number> o3 = new MyClass03<Number>();
		MyClass03<? extends Number> o4 = new MyClass03<Integer>();
		MyClass03<? extends Number> o6 = new MyClass03<Double>();
		Number n1 = o4.item; //integer는 number다 (o)
		Object o5 = o4.item; //number의 상위타입은 가능
		
//		Integer i1 = o4.item; //number의 하위타입은 불가능
		//인스턴스 타입이 어떤건지 알 수 없으니까  
	
	}
}

class MyClass03<T>{
	public T item;
}
