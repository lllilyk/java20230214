package ch02.lecture.p02type;

public class C13Expression {
	public static void main(String[] args) {
		// 연산 중 자동 형변환
		// 연산의 결과가 큰 타입으로 결정된다. 
		
		byte b1 = 30;
		byte b2 = 10;
		
//		byte b3 = b1 + b2; //byte, short, char, int의 연산 결과는 int! 주의하기
		int i3 = b1 + b2;
		System.out.println(i3);
		
		
		byte b4 = (byte)(b1 + b2);//정 byte를 쓰고 싶은 경우에는 강제형변환. 
		System.out.println(b4); 
		
		byte b5 = 30 + 10; //이렇게는 가능함 30하고 10은 literal 값이므로. 
		
		// 정수간의 연산에서 long이 포함된 연산의 결과는 long
		long l6 = 30;
		long l7 = 10;
//		int i6 = l6 + l7; //8byte공간에 저장되어있던 값들을 4byte공간으로 옮기면 당연히 오류
		long l8 = l6 + l7;
		System.out.println(l8);
		
		int i9 = 20;
		long l10 = i9 + l7; //int + long = long으로 결과 출력가능
		int i10 = (int) (i9 + l7); //굳이 int로 결과 출력하고 싶으면 강제형변환.
		
		// 정수와 실수끼리 연산 결과는 실수
		int i11 = 30;
		double d11 = 3.14;
		
		double d12 = i11 + d11;
		System.out.println(d12);
		
		
	}
}
