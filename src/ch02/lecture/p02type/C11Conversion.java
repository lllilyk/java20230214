package ch02.lecture.p02type;

public class C11Conversion {
	public static void main(String[] args) {
		//자동 형변환시 형식 : 옮겨담을 큰 값 = 옮길 작은 값;
		
		//정수
		int i1; //4bytes
		long l1; //8bytes
		
		i1 = 100;
		l1 = i1; //작은 값을 큰 값에 옮겨 담는 것은 문제x
		
		//실수
		float f1; //4bytes
		double d1; //8bytes
		
		f1 = 3.14F;
		d1 = f1; //작은 값을 큰 값에 옮겨 담는 것은 문제x
		
		//정수 타입간에 작은 타입 > 큰 타입 : 자동 형변환
		//정수 > 실수 : 자동 형 변환
		
		int i2;
		double d2;
		
		i2 = 999999;
		d2 = i2; //정수에서 실수로 자동 형변환
		
		long l2; //8bytes
		l2 = 999999999999L;
		d2 = l2;//정수에서 실수로 자동 형변환
		
		System.out.println(d2);
		
		float f2; //4bytes
		f2 = l2;
		
//		l2 = f2;//실수에서 정수로 형변환은 자동으로 이루어지지 않아서 강제로 해야함. 
		System.out.println(f2); //float 쓸때는 주의! double을 주로 사용.
		
		// 문자(char)에서 정수(int, long)으로 자동 형변환
		char c3 = '가';
		int i3 = c3; //자동 형변환(2bytes > 4bytes)
		long l3 = c3; //자동 형변환(2bytes > 8bytes)
		
		
		
	}
}
