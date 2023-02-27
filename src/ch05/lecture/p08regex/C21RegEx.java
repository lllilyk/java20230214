package ch05.lecture.p08regex;

public class C21RegEx {
	public static void main(String[] args) {
		// word character
		// \w : 영문대소문자 & 숫자 & 언더스코어를 의미
		
		String pattern1 = "\\w"; //pattern1과 pattern2는 같은 역할을 하는 코드
		String pattern2 = "[0-9a-zA-Z_]"; //[ ] 안에 순서는 상관없음
		
		System.out.println("a".matches(pattern2));
		System.out.println("b".matches(pattern1));
		
		System.out.println("C".matches(pattern1));
		System.out.println("5".matches(pattern2));
		System.out.println("_".matches(pattern1));	
		
		
		// 영문대소문자 숫자 언더스코어로 이루어진 단어 2개로만 표현된 문자열
		String pattern3 = "\\s*\\w+\\s+\\w+\\s*"; //앞 뒤 공백이 있어도 되고 없어도 되면 앞 뒤에 (\\s* : 공백) 붙여주기 
		System.out.println("Hello World".matches(pattern3));
		System.out.println("Hello     World     ".matches(pattern3));
		System.out.println("my_name 0107777    ".matches(pattern3));
		
		
	}
}
