package ch14.lecture.p04name;

public class C01Name {
	public static void main(String[] args) {
		// 현재 스레드 객체 얻기
		Thread t1 = Thread.currentThread();
		
		// 스레드 이름 얻기
		System.out.println(t1.getName()); //이름 지어준 적 없으니까 무조건 실행되는 스레드인 main스레드의 이름 즉 main이  출력됨
		
		// 스레드 이름 바꾸기
		t1.setName("메인 스레드");
		
		System.out.println(t1.getName());
	
	}
	
}
