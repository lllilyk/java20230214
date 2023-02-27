package ch05.lecture.p08regex;

public class C12RegEx {
	public static void main(String[] args) {
		// 수량 n~m : {n,m}
		
		String pattern = "a{1,3}"; //a라는 글자가 1개 or 2개 or 3개인 경우에 true
		
		System.out.println("a".matches(pattern));
//		System.out.println("aa".matches(pattern));
		System.out.println("".matches(pattern)); //false
		System.out.println("aaaa".matches(pattern)); //false
//		System.out.println("abc".matches(pattern)); //false
		
		
		
		
		
	}
	
}
