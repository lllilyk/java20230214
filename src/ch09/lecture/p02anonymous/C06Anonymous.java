package ch09.lecture.p02anonymous;

public class C06Anonymous {
	
	public static void main(String[] args) {
		class Sub06 extends MyClass06 { //추상 클래스의 상속을 받았으므로 추상 메소드 반드시 재정의
			@Override
			void mymethod() {
				System.out.println("로컬클래스 재정의1"); //메소드 안에서 선언된 클래스이므로 로컬 클래스
			}
		}
		MyClass06 o1 = new Sub06();
		method1(o1);
		
		//--------------------------------------------------------------
		MyClass06 o2 = new MyClass06() {
			@Override
			void mymethod() { //추상 메소드 재정의
				System.out.println("로컬클래스 재정의2(익명클래스)");
			}
		};
		method1(o2);
		
		//--------------------------------------------------------------
		method1(new MyClass06() {
			@Override
			void mymethod() {
				System.out.println("로컬클래스 재정의3(익명클래스, 아규먼트)");
			}
		});
	}
	
	public static void method1(MyClass06 param) {
		param.mymethod();
	}
}

abstract class MyClass06 {
	abstract void mymethod();
}