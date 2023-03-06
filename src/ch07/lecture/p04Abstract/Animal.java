package ch07.lecture.p04Abstract;

// 추상클래스(abstract class)
// 이 클래스로 인스턴스를 만들 수 없음
public abstract class Animal { // 몸통이 있으므로 추상 메소드x
	
	public void see() {
		System.out.println("눈으로 봅니다.");
	}
	
	//추상 메소드 (abstract method)
	//몸통(body)이 없는 메소드
	//추상 메소드가 있는 클래스는 추상 클래스이어야 함
	//상속 받는 클래스에서 꼭 재정의해야함. 
	public abstract void breath(); //몸통이 없는 추상 메소드o
}
