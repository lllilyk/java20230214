package ch16.lecture.p01anonymous;

public class C02Lambda {
	public static void main(String[] args) {
		MyInterface02 o1 = () -> System.out.println("재정의한 메소드"); //추상 메소드가 하나였기 때문에 람다식으로 생략 가능했음
		o1.method1();
	}
}

interface MyInterface02 {
	void method1();

}