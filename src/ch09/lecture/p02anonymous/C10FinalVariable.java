package ch09.lecture.p02anonymous;

public class C10FinalVariable {
	
	int j;
	
	public void method1() {
		int i = 3; //effectively final
		j = 99;
		j = 100; //지역변수(파라미터)가 아니면 여러번 값 할당해도 상관x
		class LocalClass{
			void method2() {
				System.out.println(i);
			}
		}
	}
}
