package ch06.lecture.p05this;

public class C01This {
	public static void main(String[] args) {
		MyClass01 o1 = new MyClass01();
		o1.name = "son"; //인스턴스 멤버에 접근하기 위해서 인스턴스 값을 담은 o1변수가 꼭 필요함.
		o1.printName();
		
		String n = o1.now();
	
	
	
	}
}
 