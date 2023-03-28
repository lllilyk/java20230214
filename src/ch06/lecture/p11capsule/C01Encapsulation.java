package ch06.lecture.p11capsule;

public class C01Encapsulation {
	public static void main(String[] args) {
		MyClass01 o1 = new MyClass01();
		//o1.age = 3;
		
		//MyClass01이 아닌 다른 클래스에서 
		//아래와 같이 age 필드의 값을 수정하는 것을 막으려면?
		//즉, 필드값에 바로 접근하는 것을 막으려면?
		//o1.age = -1; 
		
		o1.setAge(3); //public이니까 다른 클래스에서 접근 가능
		o1.desc();
		
		o1.setAge(-1);
		o1.desc();
		
		
	}
}
