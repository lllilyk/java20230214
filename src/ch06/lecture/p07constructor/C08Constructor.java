package ch06.lecture.p07constructor;

public class C08Constructor {
	public static void main(String[] args) {
		MyClass08 o1 = new MyClass08("son", 33, "01-02", false);
		
		//이렇게 해도 됨.
		MyClass08 o2 = new MyClass08("park", 55, null, false);
		o2.birthDate = "03-26";
		
		//생성자 오버로딩으로 만든 생성자 이용
		MyClass08 o3 = new MyClass08("cha", 77, false);
		o3.birthDate = "03-05";
		
	}
}
