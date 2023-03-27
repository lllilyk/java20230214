package ch14.sec05.exam02;

public class JoinExample {
	
	//SumThread가 계산 작업을 모두 마칠때까지 main스레드가 일시 정지 상태에 있다가 
	//SumThread가 최종 계산된 결과값을 산출하고 종료하면 메인 스레드가 결과값을 받아 출력
	
	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		try {
			sumThread.join(); //sumThread 결과값을 받아서
		} catch (InterruptedException e) {
		}
		System.out.println("1~100 합: " + sumThread.getSum()); //여기서 같이 출력
	}
}
