package ch04.sec05;

import java.util.Scanner;

public class WhilePractice7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int total = 0;
		String select = "";

		boolean a = true;
		while(a){
		   System.out.println("---------------------------------");
		   System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		   System.out.println("---------------------------------");
		   System.out.print("선택> ");
		   select = scanner.nextLine();
		   
		   if(select.equals("1")) {
			   System.out.print("예금액>");
			   int money = Integer.parseInt(scanner.nextLine());
			   total += money;
		   } else if(select.equals("2")) {
			   System.out.print("출금액>");
			   int money = Integer.parseInt(scanner.nextLine());
			   total -= money;
		   } else if(select.equals("3")) {
			   System.out.println("잔고>" + total);
		   } else {
			   a = false;
		   }
		}
		System.out.println("프로그램 종료");
	}
}
