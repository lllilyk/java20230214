package ch08.sec07;

public interface Service {
	//interface는 몸통이 있는 default method를 가질 수 있음
	//디폴트 메소드는 구현 객체가 필요한 메소드
	//인스턴스(객체)를 통해서 호출가능
	
	//디폴트 메소드
	default void defaultMethod1() {
		System.out.println("defaultMethod1 종속 코드");
		defaultCommon();
	}
	
	default void defaultMethod2() {
		System.out.println("defaultmethod2 종속 코드");
		defaultCommon();
	}
	
	//private 메소드
	private void defaultCommon() {
		System.out.println("defaultMethod 중복 코드A");
		System.out.println("defaultMethod 중복 코드B");
	}
	
	//정적 메소드
	static void staticMethod1() {
		System.out.println("staticMethod1 종속 코드");
		staticCommon();
	}
	
	static void staticMethod2() {
		System.out.println("staticMethod2 종속 코드");
		staticCommon();
	}
	
	//private 정적 메소드
	private static void staticCommon() {
		System.out.println("staticMethod 중복 코드A");
		System.out.println("staticMethod 중복 코드B");
	}
}
