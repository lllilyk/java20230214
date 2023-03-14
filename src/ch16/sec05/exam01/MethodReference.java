package ch16.sec05.exam01;

public class MethodReference {
	public static void main(String[] args) {
		Person person = new Person();

		// 정적 메소드일 경우
		// 람다식
		// 클래스명으로 바로 접근 가능
		// person.action((x, y) -> Computer.staticMethod(x, y)); 
		// 메소드 참조
		person.action(Computer::staticMethod);

		// 인스턴스 메소드일 경우
		Computer com = new Computer();
		// 람다식
		// person.action((x, y) -> com.instanceMethod(x, y));
		// 메소드 참조
		person.action(com::instanceMethod);
	}
}
