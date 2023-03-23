package ch14.lecture.p01thread;

public class C06Thread {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread6()); //Thread가 이미 Runnable을 구현했기 때문에
		t1.start();
		System.out.println("mainthread_________");
	}
}

class MyThread6 extends Thread { 
	
	//Thread는 Runnable 인터페이스를 구현한 클래스이므로 Runnable의 run() 메소드를 재정의 해주어야 하고 
	//MyThread6는 Thread를 상속받았으므로 run() 메소드를 다시 재정의 해주어야 한다. 
	
	@Override
	public void run() {
		while(true) {
			System.out.println("###작업스레드###");
		}
	}
}