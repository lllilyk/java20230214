package ch06.lecture.p07constructor;

public class C09String {
	public static void main(String[] args) {
		//String에 생성자가 오버로딩 되어있는 것 확인
		String s1 = new String();
		System.out.println(s1); //아무것도 출력되지 않음
		
		String s2 = new String(new byte[] {97, 98, 99});
		System.out.println(s2); //asc코드 출력값 a, b, c
		
		// String에 hover해서 나오는 설명을 보거나 java api설명 찾아보기!!
		String s3 = new String(new byte[] {97, 98, 99}, 1, 2);
		System.out.println(s3); //1번 인덱스부터 2개의 subarray를 도출하고 싶을 때
		
		String s4 = new String(new char[] {'가', '나', '다', 'a', 'b'});
		System.out.println(s4);
		
		String s5 = new String("hello");
		System.out.println(s5);
		
	}
}
