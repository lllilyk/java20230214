package ch13.sec02.exam03;

public class Box <T>{
	public T content; //T 타입의 필드 이름 : content
	
	//Box의 내용물이 같은지 비교
	//타입 파라미터는 기본적으로 Object 타입으로 간주 
	//Object가 가지고 있는 메소드(equals) 호출 가능
	public boolean compare(Box<T> other) {
		boolean result = content.equals(other.content);
		//content의 타입 파라미터를 명시하지 않았기 때문에 Object로 간주
		//때문에 content.equals사용 가능
		return result;
	}
}
