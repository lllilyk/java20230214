package ch05.lecture.p08regex;

public class C06RegEx {
	public static void main(String[] args) {
		System.out.println("Az".matches("[A-Z][a-z]"));
		System.out.println("Bz".matches("[A-Z][a-z]"));
		System.out.println("Zz".matches("[A-Z][a-z]"));
		
		System.out.println("zZ".matches("[A-Z][a-z]"));
		
		
	}
}
