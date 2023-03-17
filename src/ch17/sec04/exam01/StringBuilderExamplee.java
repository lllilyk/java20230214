package ch17.sec04.exam01;

public class StringBuilderExamplee {
	public static void main(String[] args) {
		// StringBuilder vs String
		
		// StringBuilder는 문자열 수정 가능
		// String은 문자열 수정 불가
		
		String a = "java"; //hello x
		String b = "html";
		
		String c = a + "hello";
		String d = b + "hello";
		
		StringBuilder e = new StringBuilder("java");
		StringBuilder f = new StringBuilder("html");
		
		System.out.println(e);
		System.out.println(f);
		
		e.append("hello");
		f.append("hello");
		
		System.out.println(e);
		System.out.println(f);
	}
}
