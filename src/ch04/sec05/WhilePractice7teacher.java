package ch04.sec05;

import java.util.Scanner;

public class WhilePractice7teacher {
	public static void main(String[] args) {
		//139p 7번문제 - 선생님 코드
		
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int balance = 0;
		
		while (run) {
			
			System.out.println("--------------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("--------------------------");
			System.out.print("선택>");
			
			int menu = scanner.nextInt();
			

			switch (menu) {
			case 1 -> {
				System.out.print("예금액>");
				int money = scanner.nextInt();
				balance += money;
			}
			case 2 -> {
				System.out.print("출금액>");
				int money = scanner.nextInt();
				balance -= money;
				
			}
			case 3 -> {
				System.out.println("잔고>" + balance);
			}
			case 4 -> {
				run = false; //다음 case를 실행하지 않고 switch문을 빠져나가기 위해서(break;와 유사)
			}
			
			
			}
		}
		
		System.out.println("프로그램 종료");
	}
}