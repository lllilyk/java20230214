package ch07.lecture.p03cast;

public class C03Cast {
	public static void main(String[] args) {
		method1(new Animal());
		method1(new Horse());
		method1(new Fish());
		
		System.out.println("실행 흐름 이어감...");
		
	}
	
	// Animal 클래스 타입에 속하기만 하면
	// 즉, Animal 클래스이거나 상속받은 클래스이기만 하면
	// a에 어떤 매개값이 들어와도 상관 없음
	public static void method1(Animal a) { 
		a.breath();
		
		//만약 말 객체이면 실행
		if(a instanceof Horse) {
			Horse  h = (Horse) a;
			h.run();
		}
		
		
		/*
		Horse h = (Horse) a; //animal은 horse다 라고 강제형변환
		//위험한 코드 > 에러발생 
		//위에 fish랑 animal 넣고 메소드 실행했는데
		//fish는 horse라고 할 수 없음  > 에러 발생
		h.run();
		*/
	}
}
