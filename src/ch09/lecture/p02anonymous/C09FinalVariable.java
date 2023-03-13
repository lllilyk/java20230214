package ch09.lecture.p02anonymous;

public class C09FinalVariable {
	// 로컬 클래스는 감싸고 있는 메소드의 
	// 지역변수(파라미터 : i)를 사용할 수 있다.
	// 이때 이 지역변수(파라미터)는 final 이어야 한다. 
	
	// 로컬클래스는 static 키워드를 이용해서 정적클래스로 만들 수 없음
	
	public static void main(String[] args) {
		final int i = 10;
//		i = 11; //xx final이니까
		class LocalClass {
			void method1() {
				System.out.println(i);
			}
		}
	}
	
	public void method1() {
		int i = 1; //값을 한 번만 할당했으므로 final이랑 다름 없음 //effectively final : 사실상 final
		
		//i = 2; // 값을 다시 할당하면 effectively final이 아니므로 26번째 줄에서 오류 발생
		
		
		class LocalClass {
			void method2() {
				System.out.println(i);
			}
		}
	}
	
	public void method2(final int param) { //이 메소드를 호출할 때 값을 할당 : 그 값이 final 값
		class LocalClass{
			void method3() {
				System.out.println(param);
			}
		}
	}
	
	//effectively final parameter
	public void method3(int param) { 
		//param = 3; // 이렇게 되면 호출할 때 한 번, 지금 한 번 해서 값이 두 번 할당된 것이 되기때문에 effectively final 해당 x 
		class LocalClass {
			void method4() {
				System.out.println(param);
			}
		}
	}
	
}
