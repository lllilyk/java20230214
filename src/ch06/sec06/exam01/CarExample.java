package ch06.sec06.exam01;

public class CarExample {
	public static void main(String[] args) {
		
		// 실행 클래스 : main 메소드를 가지고 있는 실행 가능한 클래스
		
		// 일반적으로 자바 프로그램은 하나의 실행 클래스와 여러개의 라이브러리 클래스들로 구성됨. 
		// 실행 클래스는 실행하면서 라이브러리 클래스를 내부에서 이용함. 
		
		//Car 객체 생성
		Car myCar = new Car(); //변수의 데이터 타입은 참조 클래스명과 같게. 
		
		// new 다음 car부분에 커서 두고 alt + 키보드 왼쪽 오른쪽 버튼으로 클래스 이동 가능
		// f3도 가능
		
		//Car 객체의 필드값 읽기
		System.out.println("모델명: " + myCar.model);
		System.out.println("시동여부: " + myCar.start);
		System.out.println("현재속도: " + myCar.speed);
		
		Car yourCar = new Car();
		System.out.println("모델명: " + yourCar.model);
		System.out.println("시동여부: " + yourCar.start);
		System.out.println("현재속도: " + yourCar.speed);
		
		myCar.speed = 100;
		System.out.println(myCar.speed);
		System.out.println(yourCar.speed); // 서로 다른 인스턴스이므로 영향x
		
		Car hisCar = yourCar;
		yourCar.speed = 50;
		System.out.println(yourCar.speed);
		System.out.println(hisCar.speed); // new 연산자를 쓰지 않고 yourCar의 참조값을 그대로 복사했으므로 영향o
	
		System.out.println(System.identityHashCode(myCar)); //myCar와 yourCar는 저장공간이 서로 다르므로 다른 참조값을 가짐 (서로 다른 인스턴스)
		System.out.println(System.identityHashCode(yourCar)); //yourCar와 hisCar는 저장공간을 가리키는 참조값이 서로 같음
		System.out.println(System.identityHashCode(hisCar));
		
	}
}
