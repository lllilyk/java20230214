package ch04.sec05;

import java.util.Scanner;

public class WhilePractice7SwitchCase {
	public static void main(String[] args) {
		//switch문으로 작성
		Scanner scanner = new Scanner(System.in);
		int total = 0;
		int select = 0;
		
		boolean a = true;
		while(a) {
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");
			select = scanner.nextInt();
			
			switch(select) {
			case 1 -> {
				System.out.print("예금액>");
				int money = scanner.nextInt();
				total += money;
			}
			case 2 -> {
				System.out.println("출금액>");
				int money = scanner.nextInt();
				total -= money;
			}
			case 3 -> {
				System.out.println("잔고>" + total);
			}
			case 4 -> {
				a = false;
			}
			}
		}
		System.out.println("프로그램 종료");
	}
}
