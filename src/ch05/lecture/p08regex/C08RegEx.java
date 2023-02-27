package ch05.lecture.p08regex;

public class C08RegEx {
	public static void main(String[] args) {
		System.out.println("a".matches("[0-9a-zA-Z]")); //소문자대문자숫자모두 일치하게 하고 싶다.
		System.out.println(".".matches("[0-9a-zA-Z]"));
		System.out.println("3".matches("[0-9a-zA-Z]"));
	
		// 영문 대소문자, 숫자로 이루어진 3글자 인가?
		System.out.println("010".matches("[0-9a-zA-Z][0-9a-zA-Z][0-9a-zA-Z]"));
		System.out.println("a c".matches("[0-9a-zA-Z][0-9a-zA-Z][0-9a-zA-Z]"));
		System.out.println("aC3".matches("[0-9a-zA-Z][0-9a-zA-Z][0-9a-zA-Z]"));
		
	}
}
