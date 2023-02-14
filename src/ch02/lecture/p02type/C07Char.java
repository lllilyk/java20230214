package ch02.lecture.p02type;

public class C07Char {
	public static void main(String[] args) {
		// Char (문자)
		// 하나의 문자값 저장
		// 2byte (16 bits)
		// 0 ~ 65535 (unicode)
		
		char c1 = 9731;
		char c2 = '\u260e';
//		char c3 = 'a';
		char c4 = '가';
//		char c5 = 'ab';// x 하나의 문자만
//		char c6 = '';// x 하나의 문자!만
		
		System.out.println(c1);
		System.out.println(c2);
//		System.out.println(c3);
		System.out.println(c4);
		
		//char는 연산 가능
		char c3 = 'a';
		char c7 = 'b'; 
		
		int d = c7 - c3;
		System.out.println(d);
		
		
		
		
		
		
	}

}
