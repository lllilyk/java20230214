package ch14.exercise.exam02;

public class ThreadExample {
	public static void main(String[] args) {
		Thread thread1 = new MovieThread();
		thread1.start();
	
		Thread thread2 = new Thread(new MusicRunnable()); // 이렇게도 할 수 있다~ //5번째 코드와 같은 역할
		thread2.start();
	
	}
}
