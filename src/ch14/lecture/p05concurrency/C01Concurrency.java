package ch14.lecture.p05concurrency;

public class C01Concurrency {
	
	static int field = 0;
	
	public static void main(String[] args) {
		Thread a = new Thread( () -> {
			for(int i = 0; i < 1000; i++) {
				field++;
			}
		}, "A Thread");
		
		// 동시에 A,B 둘 다 1000번까지 올리는 작업실행 -> 2000이 될수도 있고 안될 수도 있음
		Thread b = new Thread( () -> {
			for(int i = 0; i <1000; i++) {
				field++;
			}
		}, "B Thread");
		
		a.start();
		b.start();
		
		try {
			a.join();
			b.join();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// *** 여러 스레드가 하나의 객체 상태를 변경하려고 할 때 
		// 매우 주의해서 코드를 작성해야 한다!!!
		
		// 해결책 1 : 여러 스레드가 하나의 객체 상태를 변경하는 코드를 아예 작성하지X
		
		System.out.println(field);
		
	}
}


