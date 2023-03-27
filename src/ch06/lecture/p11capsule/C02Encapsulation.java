package ch06.lecture.p11capsule;

public class C02Encapsulation {
	public static void main(String[] args) {
		MyClass02 o1 = new MyClass02();
//		o1.age = 3;
//		
//		o1.age = 30;
		
		//MyClass02의 age필드값을 수정하지는 못하지만 읽어오는 것은 가능
		System.out.println("나이 : " + o1.getAge());
		o1.updateAge();
		
		System.out.println("나이 : " + o1.getAge());
		o1.updateAge();
		
		System.out.println("나이 : " + o1.getAge());
		
	}
}
