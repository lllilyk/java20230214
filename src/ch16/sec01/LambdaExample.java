package ch16.sec01;

public class LambdaExample {
	public static void main(String[] args) {
		//action 메소드를 호출할 때 매개값으로 람다식 제공
		//람다식 : 인터페이스의 익명 구현 객체
		//인터페이스의 매개변수에 대입 가능
		action((x, y) -> {
			int result = x + y;
			System.out.println("result : " + result);
		});
		
		//action() 메소드를 호출하려면 calculable 매개값 필요 - Calculable의 익명구현 객체인 람다식을 매개변수로 대입
		action((x, y) -> {
			int result = x - y;
			System.out.println("result : " + result);
		});
	
	}
	
	public static void action(Calculable calculable) {
		//데이터 제공
		int x = 10;
		int y = 4;
		//데이터 처리
		calculable.calculate(x, y); // Calculable 인터페이스의 calculate 추상 메소드 호출
	 }
}
