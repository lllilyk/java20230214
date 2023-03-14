package ch16.lecture.p03reference;

public class C05MethodReference {
	MyInterface06 o1 = (x) -> x.someMethod(); //첫번째 파라미터의 인스턴스메소드 호출
	MyInterface06 o2 = MyClass06::someMethod; //두번째 파라미터 없으니까 생략
}

interface MyInterface06{
	void action(MyClass06 o); //추상메소드가 MyClass06타입을 가짐
}

class MyClass06{
	void someMethod() {
		
	}
}
