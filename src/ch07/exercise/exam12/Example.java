package ch07.exercise.exam12;

public class Example {
	public static void action(A a) {
		a.method1();
		if(a instanceof C c) { 
			//a가 C클래스 타입인 경우에만 
			//클래스 변수 c에 C클래스타입으로 
			//강제형변환한 a를 담겠다. 
			//C c = (C) a; 쓸 필요 x
			c.method2();
		}
	}
	
	public static void main(String[] args) {
		action(new A());
		action(new B());
		action(new C());
	}
}
