package ch14.sec04;

public class ThreadNameExample {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread(); //현재 코드를 어떤 스레드가 실행하고 있는지 확인
		System.out.println(mainThread.getName() + " 실행"); //현재 코드를 실행하고 있는 스레드의 이름 출력
		
		for(int i = 0; i<3; i++) {
			Thread threadA = new Thread() {
				@Override
				public void run() {
					System.out.println(getName() + " 실행");
				}
			};
			
			threadA.start();
		}
		
		Thread chatThread = new Thread() {
			@Override
			public void run() {
				System.out.println(getName() + " 실행");
			}
		};
		chatThread.setName("chat-thread"); //작업 스레드의 이름 수정
		chatThread.start();
	}
}
