package ch09.lecture.p02anonymous;

public class C05Anonymous {
	public static void main(String[] args) {
		//로컬 클래스?
		MyClass05 o1 = new MyClass05();
		method1(o1);
		
		//로컬 클래스
		class SubClass05 extends MyClass05 {
			
		}
		
		MyClass05 o2 = new SubClass05();
		method1(o2);
		
		MyClass05 o3 = new MyClass05() {
			
		};
		method1(o3);
		
		method1(new MyClass05() {
			
		});
	}
	
	public static void method1(MyClass05 param) {
		System.out.println("잘 되는군");
	}
}

class MyClass05 {
	
}