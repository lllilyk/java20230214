package ch11.lecture.p02try_catch;

public class C03CustomException {
	MyException1 e = new MyException1();
	MyException1 e1 = new MyException1("some message"); //x 밑에서 생성자 만들지 않았으므로 불가 (스트링 타입을 받는 생성자 만들면 가능)
}

class MyException1 extends Exception {
	
	public MyException1() {
		
	}
	public MyException1(String message) {
		//super();// 이게 자동으로 실행되니까
		//명시적으로 
		super(message);  
	}
}
