package ch03.lecture.p01arithmetic;

public class C07Divide {
	public static void main(String[] args) {
		// 실수를 0으로 나누면 무한대(infinity)
		double a = 0.0;
		double b = 3.0;
		
		double c = b / a;
		System.out.println(c); //무한대
		
		double d = -3.0;
		double e = d / a;
		System.out.println(e); //음의 무한대
		
		//실수를 0으로 나눈 나머지 : NaN(Not a Number)
		double f = 3.0 % 0.0;
		System.out.println(f);//NaN
		
		double g = f + 1.0;
		System.out.println(g); //NaN
		
		// 무한대인지 확인
		boolean isinfinite1 = Double.isInfinite(c);//boolean타입
		System.out.println(isinfinite1);
		
		boolean isinfinite2 = Double.isInfinite(3.0);//boolean타입
		System.out.println(isinfinite2);
		
		// NaN인지 확인
		boolean isNaN1 = Double.isNaN(f);// boolean 타입을 리턴
		System.out.println(isNaN1);
		
		boolean isNaN2 = Double.isNaN(2.0);
		System.out.println(isNaN2);
		
	}

}
