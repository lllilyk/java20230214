package ch02.sec04;

public class FloatDoubleExample {
	public static void main(String[] args) {
		//정밀도 확인
		float var1 = 0.1234567890123456789f;
		double var2 = 0.1234567890123456789;
		System.out.println(var1);
		System.out.println(var2);
		
		//10의 거듭제곱 리터럴(지수표현)
		double var3 = 3e6; //3 * 10의 6승을 의미함
		float var4 = 3e6F; // 3 * 10의 6승
		double var5 = 2e-3; //2 * 10의 -3승
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
	}

}
