package ch11.lecture.p04throw;

public class C04Throw {
	public static void main(String[] args) {
	try {
		method1();
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
		
		System.out.println("continue...");
	}
	
	//exception을 던지면 표시를 해줘야하는데 unchecked exception은 컴파일러가 확인하지 않기 때문에 throws 키워드 꼭 적을 필요 없음
	public static void method1() {
		throw new RuntimeException();
	}
}
