package ch09.lecture.p02anonymous;

public class C02Anonymous {
	//상속과 이름없는 클래스의 구현이 한 번에!
	public static void main(String[] args) {
		
		//상속과 인스턴스 생성을 동시에
		MyClass02 o1 = new MyClass02(){
			//클래스 구현(상속받은 클래스의 이름이 없는 것) 
		};
	}
}

class MyClass02{
	
}