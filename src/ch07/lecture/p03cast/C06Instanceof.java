package ch07.lecture.p03cast;

public class C06Instanceof {
	public static void main(String[] args) {
		Super06 o1 = new Sub06();
		//
		// o1.method1();// 강제 타입변환 필요

		if (o1 instanceof Sub06) { // o1이 Sub06일때만 강제타입변환하겠다..
			Sub06 o2 = (Sub06) o1;
			o2.method1();
		}
		System.out.println("실행 흐름 이어감..");
	}
}
	class Super06 {
	}

	class Sub06 extends Super06 {
		public void method1() {
			System.out.println("Sub06 method1");
		}
	}
