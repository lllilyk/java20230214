package ch05.lecture.p08regex;

public class C07Regex {
	public static void main(String[] args) {
		System.out.println("a".matches("[a-zA-Z]")); //a-z또는 A-Z범위 안에 있는가?
//		System.out.println("b".matches("[a-zA-Z]"));
//		System.out.println("z".matches("[a-zA-Z]"));
//		System.out.println("A".matches("[a-zA-Z]"));
//		System.out.println("Z".matches("[a-zA-Z]"));
		
		System.out.println("0".matches("[a-zA-Z]"));
//		System.out.println("2".matches("[a-zA-Z]"));
//		System.out.println("4".matches("[a-zA-Z]"));
		
		System.out.println("0".matches("[0-9]"));
//		System.out.println("2".matches("[0-9]"));
//		System.out.println("4".matches("[0-9]"));
		
	}
}
