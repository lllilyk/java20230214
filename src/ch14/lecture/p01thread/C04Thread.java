package ch14.lecture.p01thread;

public class C04Thread {
	public static void main(String[] args) {
		/*
		Thread t1 = new Thread() {
			@Override
			public void run() {
				while (true) {
					System.out.println("thread 실행중");
				}
			}
		};
		*/

		// 람다식으로 작성 가능
		Thread t1 = new Thread(() -> {
			while (true) {
				System.out.println("thread 실행중");
			}
		});

		t1.start();

		while (true) {
			System.out.println("메인 thread 실행중");
		}
	}
}
