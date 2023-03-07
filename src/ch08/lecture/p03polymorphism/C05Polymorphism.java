package ch08.lecture.p03polymorphism;

public class C05Polymorphism {
	public static void main(String[] args) {
		
		//charsequence에 string, stringbuilder다 속함
		String s1 = "hello world";
		StringBuilder s2 = new StringBuilder("world");
		String s3 = s1.replace(s2, "java");
		System.out.println(s3);
	
	
	}
}
