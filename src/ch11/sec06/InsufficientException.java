package ch11.sec06;

public class InsufficientException extends Exception{
	public InsufficientException() {  //기본 생성자 만들어주기
		
	}
	
	public InsufficientException(String message) { //메시지 넣고 싶으면 상위타입 파라미터에 넣어주기
		super(message);
	}
}
