package ch12.lecture.p01object;

public class C03ToString {
	public static void main(String[] args) {
		MyClass03 o1 = new MyClass03();
		String s1 = o1.toString();
		System.out.println(s1);
		// @를 기준으로 좌항은 클래스의 full name 
		// 우항은 참조값이 저장된 장소의 주소를 16진법으로 변환한 결과
		
		
		Object o2 = o1;
		System.out.println(o2.toString());
		System.out.println(System.identityHashCode(o2));
		
		Object o3 = new MyClass03();
		System.out.println(o3.toString());
		System.out.println(System.identityHashCode(o3));
	} 
}

class MyClass03 {
	
}
