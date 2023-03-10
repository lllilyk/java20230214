package ch09.sec07.exam01;

public class Car {
	//필드에 Tire 객체 대입
	private Tire tire1 = new Tire();
	
	//필드에 익명 자식 객체 대입
	private Tire tire2 = new Tire() {
		@Override
		public void roll() {
			System.out.println("익명 자식 Tire 객체 1이 굴러갑니다.");
		}
	};
	
	//메소드(필드 이용)
	public void run1() {
		tire1.roll();
		tire2.roll();
	}
	
	//메소드(로컬 변수 이용)
	public void run2() {
		//로컬 변수에 익명 자식 객체 대입
		Tire tire = new Tire() { //상속과 인스턴스 생성을 한 번에 
			@Override
			public void roll() { //맘에 안드는 메소드 재정의
				System.out.println("익명 자식 Tire 객체 2가 굴러갑니다.");
			}
		};
		tire.roll(); //tire타입이니까 roll메소드가 있는게 확실. 실행가능
	}
	
	//메소드(매개변수 이용)
	public void run3(Tire tire) {
		tire.roll();
	}
}
