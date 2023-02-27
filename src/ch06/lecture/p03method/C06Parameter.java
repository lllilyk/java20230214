package ch06.lecture.p03method;

public class C06Parameter {
	public static void main(String[] args) {
		// 자동형변환 : 값의 허용범위가 작은 타입이 허용범위가 큰 타입으로 대입
		// byte < short,char, < int < long < float < double
		
		int a = 3;
		long b = a;
		double c = b;
		char d = 'a';
		int e = d;

		MyClass06 o1 = new MyClass06();
		o1.method1(33);
		o1.method1('c');
		
		o1.method2(297834927934792743L);
		o1.method2(33);
		o1.method2('d');
		
		o1.method3(3.14);
		o1.method3(2938749298374982734L);
		o1.method3(55);
		
		o1.method4(3.14f); //되고
		o1.method4(298342L); //되고
		o1.method4(99); //되고
		//o1.method4(3.14); //안되고 
		// double 타입이 float 타입보다 더 크기 때문에 자동형변환 불가
		
		
		
		
		
	}
}
