package ch05.lecture.p08regex;

public class C23RegEX {
	public static void main(String[] args) {
		// . : 모든 문자
		// \. : 그냥 단순히 . 온점을 표현하고 싶을 때는 \.

		String pattern1 = ".";
		String pattern2 = "\\."; //자바에서 역슬래시 쓸 때는 \\ 두 개!
		
		System.out.println("a".matches(pattern1));
		System.out.println("a".matches(pattern2));
	
		System.out.println(".".matches(pattern1));
		System.out.println(".".matches(pattern2));
	
		// 영문대소문자 여러개 이후에 .com으로 끝나는지 확인하고 싶은 경우
		String pattern3 = "[a-zA-Z]+\\.com";
		System.out.println("daum.com".matches(pattern3));
		System.out.println("daum.net".matches(pattern3));
		System.out.println("daumnet".matches(pattern3));
	
	
	
	
	}
}
