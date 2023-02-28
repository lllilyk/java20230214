package ch06.lecture.p04static;

public class C01Instance {
	public static void main(String[] args) {
		MyClass01 o1 = new MyClass01();
		o1.age = 33; //비어있는 변수에 값 입력
		o1.name = "son";
		o1.greeting(); 
		
		MyClass01 o2 = new MyClass01();
		o2.age = 44; //o1이 가지고 있는 age와 o2가 가지는 age는 다름
		o2.name = "park";
		o2.greeting(); //o1이 가지는 메소드와 o2가 가지는 메소드도 다르다고 이해할것
	}
}
