package ch06.lecture.p11capsule;

public class C01Encapsulation {
	public static void main(String[] args) {
		MyClass01 o1 = new MyClass01();
		//o1.age = 3;
		
		//o1.age = -1; //이렇게 되지 않도록 하려면?
		
		o1.setAge(3);
		o1.desc();
		
		o1.setAge(-1);
		o1.desc();
		
		
	}
}
