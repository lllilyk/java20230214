package ch03.exercise;

public class Example05 {
	public static void main(String[] args) {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		
//		double area =
		System.out.println((lengthTop + lengthBottom) * height / 2.0); // 나눌 때 double으로 나누었으므로 결과도 double타입
		System.out.println((lengthTop + lengthBottom) * height * 1.0 / 2); // 곱할 때double로 곱했으므로 결과도 double타입 
		System.out.println((double) (lengthTop + lengthBottom) * height / 2); // (lengthTop + lengthBottom)를 먼저 계산하고 이 값을 double로 바꾸고 height을 곱하고 2로 나눈 결과이므로  double타입 
		System.out.println((double) ((lengthTop + lengthBottom) * height / 2)); // 이미 연산결과가 int로 나온 상태에서 double로 바꾸는 것은 소용이 없음
		
		
		
		
	}
}
