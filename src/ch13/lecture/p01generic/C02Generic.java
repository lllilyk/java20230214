package ch13.lecture.p01generic;

import java.util.*;

public class C02Generic {
	public static void main(String[] args) {
		MyClass02<String> o1 = new MyClass02<String>(); 
		//안에 있는 T가 전부 String type으로 바뀌었다고 생각하면 됨
		o1.setItem("java");
		String s1 = o1.getItem();
		System.out.println(s1.length());
		
		MyClass02<Scanner> o2 = new MyClass02<Scanner>();
		o2.setItem(new Scanner(""));
		Scanner sc = o2.getItem();
		System.out.println(sc.hasNext()); 
		//hasNext()
		//입력된 다음 토큰이 있으면 true출력
		
		//기본 타입은 타입 아규먼트로 사용불가
		//Wrapper type 사용
		MyClass02<Integer> o3 = new MyClass02<>();
		o3.setItem(3); //autoboxing
		int i = o3.getItem(); //unboxing
		System.out.println(i);
		
	}
}

//generic type
//T : type parameter
//type parameter 작성 관습 : 대문자 한글자
//https://docs.oracle.com/javase/tutorial/java/generics/types.html
class MyClass02<T> { //T에 타입이 결정이 되면 그때 item의 타입도 결정되는 것
	private T item; 

	public T getItem() { //리턴타입 : T(필드값), 리턴값 : 필드값
		return item;
	}
	
	public void setItem(T item) { //리턴타입 : void, 매개변수 타입 : T(필드값)
		this.item = item;
	}
}