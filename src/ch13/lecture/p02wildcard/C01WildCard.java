package ch13.lecture.p02wildcard;

public class C01WildCard {
	public static void main(String[] args) {
		MyClass01<Object> o1 = new MyClass01<>();
		MyClass01<String> o2 = new MyClass01<>();
		
		o1.item = new Object();
		o2.item = new String();
		
		//타입에 하위 타입의 인스턴스는 대입가능
		o1.item = new String(); //o String은 Object다
		
		//MyClass01<String> o2 = new MyClass01<Object>();
		//o2.item = new Object(); 
		//object는 string이다x
		
//		MyClass01<Object> o3 = o2; //x 19번째 줄이 오류니까 이 코드도 오류
//		MyClass01<Object> o3 = MyClass01<String>(); //string이 object다. 
		
		//o3.item = new Object();  
//		MyClass01<String> = MyClass01<Object>();
		
		//근데 타입 vs 타입을 비교할 때는 하위 타입도 대입 불가
		//o3은 타입을 object라고 명시해두었기 때문에 object이외의 타입은 올 수 없음
	}
}

class MyClass01<T>{
	public T item;
}