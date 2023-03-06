package ch07.sec07.exam02;

public class ChildExample {
	public static void main(String[] args) {
		//자식 객체 생성
		Child child = new Child();
		
		//자동 타입 변환
		//parent의 타입은 Parent
		//산리오 캐릭터즈에 한교동 할당가능
		//
		Parent parent = child; //자식은 부모다
		
		//메소드 호출
		parent.method1();
		parent.method2();
		//parent.method3();
	}
}
