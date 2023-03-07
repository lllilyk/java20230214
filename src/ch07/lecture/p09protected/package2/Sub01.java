package ch07.lecture.p09protected.package2;

import ch07.lecture.p09protected.package1.*;

public class Sub01 extends Super01{
	public void method2() {
		// 상속받은 클래스는 패키지가 달라도 가능
		method1(); 
		this.method1();
		super.method1();
		
		/*
		public void method3() {
			Super01 o1 = new Super01(); //인스턴스를 만들어서 접근하는 건 상속이랑 다름
			o1.method1(); //다른 패키지여서 불가
		}*/
	}
}
