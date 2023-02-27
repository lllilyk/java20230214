package ch05.lecture.p08regex;

public class C25RegEx {
	public static void main(String[] args) {
		// unicode script
		// \p{IsHangul} //아래와 똑같은 역할을 하는 코드
		// 한글 [가-힣] 
		
		String pattern1 = "[가-힣]";
		String pattern2 = "\\p{IsHangul}"; //자바에서 역슬래시 쓸 때는 \\두 개!
		
		System.out.println("백".matches(pattern1));
		System.out.println("두".matches(pattern2));
		System.out.println("산".matches(pattern2));
		
		// 공백없이 한글2글자 이상
		String pattern3 = "\\p{IsHangul}{2,}";
		System.out.println("두산".matches(pattern3));
		System.out.println("백두산".matches(pattern3));
		System.out.println("산".matches(pattern3));
	}
}
