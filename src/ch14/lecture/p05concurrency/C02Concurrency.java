package ch14.lecture.p05concurrency;

public class C02Concurrency {
	//synchronized 블럭(동기화 블럭)
	
	static int field = 0;
	
	public static void main(String[] args) {
		//공통 객체를 만들어주기 
		//intrinsic lock
		//monitor lock
		//monitor
		//lock라고 불림
		
		Object o = new Object();
		//o 객체를 획득한 스레드가 synchronized 실행하고 다 실행한 뒤에는 반납함
		//그럼 다른 스레드가 또 o객체를 획득해서 synchronized 실행하고 또 반납 반복
		
		
		Thread a = new Thread(() -> {
			for(int i = 0; i < 100000; i++) {
				//synchronized : a 스레드랑 b 스레드를 나눠서 보지 말고 한 번에 봐라
				synchronized (o) {//o 객체를 획득한 경우에만 a스레드 실행시킬 수 있음					
					field++;
				}
				
			}
		});
		
		Thread b = new Thread(() -> {
			for(int i = 0; i < 100000; i++) {
				//synchronized : a 스레드랑 b 스레드를 나눠서 보지 말고 한 번에 봐라
				synchronized (o) {//o 객체를 획득한 경우에만 b스레드 실행시킬 수 있음			
					field++;
				}
			}
		});
		
		a.start();
		b.start();
		
		try {
			a.join();
			b.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(field);
	}
	
}
