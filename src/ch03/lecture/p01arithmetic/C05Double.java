package ch03.lecture.p01arithmetic;

import java.math.BigDecimal;

public class C05Double {
	public static void main(String[] args) {
		double a = 0.1; //2진법으로 표현하면 0.00011001100110011~
		double b = 0.2; //2진법으로 표현하면 0.00110011001100110011~
		
		double c = a + b;
		
		System.out.println(c); //결과값이 이상하게 나오는 이유(2진법)
	
		BigDecimal num1 = new BigDecimal("0.1");
		BigDecimal num2 = new BigDecimal("0.2");
		
		BigDecimal res = num1.add(num2);
		
		System.out.println(res);
	
	
	
	}
}
