package ch02.sec01;

public class VariableExchangeExample {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		
		// 코드 작성(값이 서로 바뀌도록)
		int temp = x; //x값을 temp에 저장해두고
		x = y;
		y = temp; // 출력값은 5 5가 됨
		
		System.out.println(x); //5 
		System.out.println(y); //3
	}

}
