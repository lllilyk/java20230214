package ch05.lecture.p08regex;

public class C13RegEx {
	public static void main(String[] args) {
		//n개 이상 : {n,}
		
		//숫자가 2개 이상
		String pattern = "[0-9]{2,}";
		
		System.out.println("09".matches(pattern));
		System.out.println("123".matches(pattern));
		System.out.println("2".matches(pattern)); //false
//		System.out.println("2a".matches(pattern)); //false
		
		
		/*
		X{n} X, exactly n times
		X{n,} X, at least n times
		X{n,m} X, at least n but not more than m times
		*/
	}
}
