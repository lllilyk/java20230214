package ch12.lecture.p01object;

public class C17Hashcode {
//o1과 o3의 해시코드 값이 같음
// String이 재정의 되었음
// hashCode()는 String을 재정의
// 서로 다른 객체이더라도 문자열이 같으면 해시코드가 같음 
//
	public static void main(String[] args) {
		Object o1 = new String("java");
		Object o2 = new String("spring");
		Object o3 = new String("java");

		int h1 = o1.hashCode();
		int h2 = o2.hashCode();
		int h3 = o3.hashCode();

		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
	}

}
