package ch14.lecture.p01thread;

public class C02Thread {
	public static void main(String[] args) {
		Process01 p1 = new Process01();
		Thread t1 = new Thread(p1);
		t1.start(); //start()를 호출하면 알아서 Runnable을 구현한 Process01클래스 -> main thread의 run()메소드를 실행시켜줌
	}
}

class Process01 implements Runnable {
	//Runnable은 스레드가 작업을 실행할 때 사용하는 인터페이스.
	//Runnable은 functional interface이므로 추상 메소드를 가짐
	//Runnable을 구현하는 클래스는 Runnable의 추상 메소드 run()을 꼭 재정의해주어야 함.
	
	@Override
	public void run() {
		System.out.println("업무 진행~~~");
	}
}