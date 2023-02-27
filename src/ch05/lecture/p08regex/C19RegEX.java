package ch05.lecture.p08regex;

public class C19RegEX {
	public static void main(String[] args) {
		// 빈칸
		// \s
		
		String pattern1 = "\\s"; //자바에서 스트링 안에 역슬래시 표시하려면 역슬래시 두 번!
		
		//자바에서 기본적으로 공백(빈칸)을 표시하는 3가지 방법
		System.out.println(" ".matches(pattern1));
		System.out.println("\n".matches(pattern1));
		System.out.println("\t".matches(pattern1));
		
		
		// 소문자 단어 3개로 이루어져 있는지 확인하고 싶은 경우
		String pattern2 = "\s*[a-z]+\s[a-z]+\s[a-z]+\s*"; // 앞 뒤 공백도 허용하고 싶은 경우 앞 뒤에 \s* 더해주기
		System.out.println("hello world java".matches(pattern2));
		System.out.println("hello world".matches(pattern2));
		System.out.println("   hello world java   ".matches(pattern2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
