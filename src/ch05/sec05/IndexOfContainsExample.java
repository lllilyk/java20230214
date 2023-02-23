package ch05.sec05;

public class IndexOfContainsExample {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍"); //indexOf() : 주어진 문자열이 시작되는 인덱스 리턴
		//System.out.println(location);
		String substring = subject.substring(location, 5); //subject의 인덱스3번부터 출력해라
		//System.out.println(substring); //substring() : 특정 위치의 문자열을 잘라내어 가져오기
		
		location = subject.indexOf("자바");
		if(location != -1) { //주어진 문자열이 포함되어 있지 않으면 indexOf()메소드는 -1을 리턴
			//System.out.println("자바와 관련된 책이군요.");
		}else {
			System.out.println("자바와 관련 없는 책이군요.");
		}
		
		boolean result = subject.contains("스프링"); //contains() 메소드는 boolean타입의 결과를 출력
		if(result) {
			System.out.println("자바와 관련된 책이군요.");
		} else {
			//System.out.println("자바와 관련 없는 책이군요.");
		}
		String menu = "ice caffe latte";
		boolean result1 = subject.contains("hot");
		if(result1) {
			System.out.println("ice is cool");
		} else {
			System.out.println("not ice");
		}
	}
}
