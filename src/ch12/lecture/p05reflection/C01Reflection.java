package ch12.lecture.p05reflection;

public class C01Reflection {
	
	public static void main(String[] args) throws Exception {
		//reflection
		//class에 관한 정보를 얻고 싶을 때
		
		//클래스 정보를 가진 객체 생성
		//<String>은 써도 되고 안 써도 됨
		//1. 클래스의 .class 속성으로 얻기
		Class<String> class1 = String.class; 
		//2. forName static method로 얻기
		Class<String> class2 = (Class<String>) Class.forName("java.lang.String");
		
		//3. 객체로부터 얻기
		String s1 = "java";
		Class<String> class3 = (Class<String>) s1.getClass();
		
		
		//다 같은 객체
		System.out.println(System.identityHashCode(class1));
		System.out.println(System.identityHashCode(class2));
		System.out.println(System.identityHashCode(class3));
	}
}
