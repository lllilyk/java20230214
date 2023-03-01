package ch06.sec10.exam02;

public class Television {
	// 정적 필드는 필드 선언과 동시에 초기값을 주는 것이 일반적
	static String company = "MyCompany"; 
	static String model = "LCD";
	static String info;
	
	static {
		info = company + "-" + model;
	}
}
