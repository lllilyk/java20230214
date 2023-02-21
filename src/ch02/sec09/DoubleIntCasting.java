package ch02.sec09;

public class DoubleIntCasting {
	public static void main(String[] args) {
		int x = 1;
		int y = 2;
//		double result = (double)x / y;
//		double result = x / (double)y;
//		double result = (double)x / (double)y;
//		System.out.println(result);
		
		int num1 = 7;
		int num2 = 3;
		
		double result1 = ((double)num1 / num2) * 1000;
		int result2 = (int) result1;
		System.out.println(result2);
}
}
