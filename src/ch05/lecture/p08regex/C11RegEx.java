package ch05.lecture.p08regex;

public class C11RegEx {
	public static void main(String[] args) {
		// 010으로 시작하고, -기호, 숫자 4개, -기호, 숫자 4개 즉 전화번호 패턴인가?
		
		
		String pattern = "010-[0-9]{4}-[0-9]{4}";
		
		System.out.println("010-9999-7777".matches(pattern));
//		System.out.println("010-1234-1234".matches(pattern));
//		System.out.println("010-2222-3333".matches(pattern));
//		System.out.println("010-2345-6543".matches(pattern));
		System.out.println("01099997777".matches(pattern));
		
	}
}
