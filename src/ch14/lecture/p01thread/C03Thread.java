package ch14.lecture.p01thread;

public class C03Thread {
	public static void main(String[] args) {
	
		//Runnable 구현 객체를 생성하고
		Process03 p1 = new Process03();
		
		//Thread 생성자의 매개값으로 Runnable 구현 객체를 전달
		Thread t1 = new Thread(p1);
	
		t1.start();
		
		while(true) {
			System.out.println("@@@@@main thread@@@@@");
		}
	}
}

//Runnable 구현 클래스는 작업 내용을 정의한 것 뿐! 
//스레드에 전달해야 함

class Process03 implements Runnable{
	@Override
	public void run() {
		while(true) {
			System.out.println("###쓰레드 실행중###");
		}
	}
}
