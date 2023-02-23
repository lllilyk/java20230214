package ch04.lecture.p03while;

import java.util.Scanner;

public class exercise9198 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		
		
		while(run) {
			
			System.out.println("------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------------");
			System.out.println("선택> ");
			
			int select = scanner.nextInt();
			int[] scores = {};
			int sum = 0;
			
			switch (select) {
			case 1 -> {
				System.out.println("학생수> ");
				int student = scanner.nextInt();
			}
			case 2 -> {
				System.out.println("점수> ");
				for(int i = 0; i < student; i++) {
					scores[i] = scanner.nextInt(); 
				}
			}
			case 3 -> {
				System.out.println("점수 합계> ");
				for(int j = 0; j< scores.length; j++) {
					sum += scores[j];
				}
				System.out.println(sum);
				System.out.println();
				
				double avg = (double) sum / scores.length;
				System.out.println("평균> " + avg);
				System.out.println();
			
				System.out.println("최고 점수> ");
				
			}
			
			
			}
			
			
		}
	}
}
