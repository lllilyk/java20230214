package ch05.lecture.p08regex;

public class C15RegEx {
	public static void main(String[] args) {
		// {0,}
		// * : 0개 이상
		
		String pattern1 = "[0-9]{0,}";
		String pattern2 = "[0-9]*";
		
		System.out.println("".matches(pattern1));
		System.out.println("".matches(pattern2));
		
		System.out.println("1".matches(pattern1));
		System.out.println("234".matches(pattern2));
		
		System.out.println("a".matches(pattern1));
		System.out.println("bb".matches(pattern2));
		
		
		
		
		
	}
	
}
