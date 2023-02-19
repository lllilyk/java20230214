package ch03.lecture.p01arithmetic;

public class C04Overflow {
	public static void main(String[] args) {
		//오버플로우(overflow)란 타입이 허용하는 최대값을 벗어나는 것을 의미.
		//언더플로우(underflow)는 반대로 타입이 허용하는 최소값을 벗어나는 것을 의미.
		
//		int a = 15_0000_0000; //a회사 매출액
//		int b = 17_0000_0000; //b회사 매출액
//		
//		System.out.println(a);
//		System.out.println(b);
//		
//		int c = a + b; //a b회사의 매출액의 합

		//overflow 발생
//		System.out.println(c); 
//		int의 허용가능 최대값을 넘었기 때문에
		
//long으로 데이터타입을 변경하면 overflow발생x
		
		long a = 15_0000_0000; //a회사 매출액
		long b = 17_0000_0000; //b회사 매출액
		
		System.out.println(a);
		System.out.println(b);
		
		long c = a + b;
		System.out.println(c);
		
//		int d = -15_0000_0000;
//		int e = -17_0000_0000;
//		
//		System.out.println(d);
//		System.out.println(e);
//		
//		// underflow 발생
//		int f = d + e;
//		System.out.println(f);
		
//long으로 데이터타입을 변경하면 underflow발생x
		long d = -15_0000_0000;
		long e = -17_0000_0000;
		
		System.out.println(d);
		System.out.println(e);

		long f = d + e;
		System.out.println(f);
		
		
		
		
		
	}

}
