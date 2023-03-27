package ch14.lecture.p01thread;

public class C07Thread {
	public static void main(String[] args) {
		Thread t1 = new Thread() { //익명 자식 객체로 작업 스레드 정의
			@Override
			public void run() {
				while(true) {
					System.out.println("작업스레드");
				}
			}
		};
		
		t1.start();
		
		while(true) {
			System.out.println("main thread");
		}
	}
}
