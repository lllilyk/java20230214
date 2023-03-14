package ch16.sec05.exam02;

public class MethodReferenceExample {
	public static void main(String[] args) {
		Person person = new Person();
		 
		//person.ordering((a,b) -> a.compareToIgnoreCase(b);
		person.ordering(String :: compareToIgnoreCase); //위의 코드와 같음
		
		//ordering이라는 메소드가
	}
}
