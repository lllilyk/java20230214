package ch09.lecture.p02anonymous;

public class C03Anonymous {
	public static void main(String[] args) {
		MyClass03 o1 = new MyClass03() {
			@Override
			void method1() {
				System.out.println("재정의한 메소드");
			}
		};
		
		o1.method1(); //실제 실행되는 메소드는 재정의한 메소드
	}
}

//추상 클래스는 new 연산자를 사용해서 객체를 직접 생성할 수 없음
//but 위에서 new 연산자를 사용해서 생성한 객체는 추상클래스인 MyClass03의 객체가아니고!
//익명 클래스인 MyClass03의 자식 객체임. 
//자신의 객체를 생성한 것이 아니기 때문에 오류x

//추상 클래스는 새로운 실체 클래스를 만들기 위한 부모 클래스로만 사용됨
//실체 클래스 : 객체를 생성할 수 있는 클래스 
abstract class MyClass03 {
	abstract void method1();
}