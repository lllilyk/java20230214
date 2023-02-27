package ch05.lecture.p08regex;

public class C14RegEx {
	public static void main(String[] args) {
		// {1,}
		// +
		
		String pattern1 = "[a-z]{1,}";
		String pattern2 = "[a-z]+"; //위의 코드와 같은 결과
		
		System.out.println("AbD".matches(pattern1));
		System.out.println("ax".matches(pattern1));
		System.out.println("A".matches(pattern1)); //false
		
		System.out.println("abc".matches(pattern2));
		System.out.println("a".matches(pattern2));
		System.out.println("A".matches(pattern2)); //false
		
	}
}
