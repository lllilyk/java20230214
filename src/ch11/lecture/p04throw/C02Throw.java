package ch11.lecture.p04throw;

public class C02Throw {
	public static void main(String[] args) {
		try {			
			method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//던질거면 던진다고 표시해주기
	public static void method1() throws Exception {
		throw new Exception();
	}
}
