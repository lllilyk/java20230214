package ch04.sec07;

public class WhileBreakPractice4 {
	public static void main(String[] args) {
		
		//두 개의 주사위의 눈의 합이 5이면 멈춤
		
		while(true) {
			int num1 = (int)(Math.random()*6)+1;
			int num2 = (int)(Math.random()*6)+1;
			System.out.println("(" + num1 + "," + num2 + ")");
//			System.out.printf("(%d, %d) %n", num1, num2);
				if(num1 + num2 == 5) {
					break;
				}
		}
	}
}	
