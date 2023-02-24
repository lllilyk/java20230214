package ch04.lecture.p03while;

import java.util.Scanner;

public class exercise9198teacher {
	public static void main(String[] args) {
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		int[] scores = null; // 참조 배열은 null로 초기화된다. 
		// 변수 scores는 int타입의 배열을 담고 있으므로 초기값으로 0이 아닌 null을 설정해야 함.
		
		while (run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택>");
			
			int menu = scanner.nextInt();
			
			switch (menu) {
			case 1 -> {
				// 학생수 입력
				System.out.print("학생수>");
				int students = scanner.nextInt();
				
				scores = new int[students]; //scores 배열 변수의 길이를 학생수 만큼 설정
			}
			case 2 -> {
				// 점수 입력
				for (int i = 0; i < scores.length; i++) { //학생수만큼 for문 반복
					System.out.print("scores[" + i + "]>");
					scores[i] = scanner.nextInt();
				}
			}
			case 3 -> {
				// 점수리스트 출력
				for (int i = 0; i < scores.length; i++) { //학생수만큼 for문 반복
					System.out.println("scores[" + i + "]: " + scores[i]); // 반복하면서 scores에 입력받은 점수를 더하기
				}
			}
			case 4 -> {
				// 분석(최대값, 평균)
				int max = 0;
				double sum = 0;
				for (int i = 0; i < scores.length; i++) {
					if (max < scores[i]) { // i = 0,1,2 즉 85, 95, 93. max:0이 85보다 작으면 max:85, max:85가 95보다 작으면 max:95, max:95는 93보다 크므로 출력되지 않아서 
						max = scores[i]; //max값은 최대값 95로 출력됨. 
					}
					sum += scores[i]; //for문이 반복되는 동안 max에 85, 95, 93이 더해짐. 
				}
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + (sum / scores.length));
				
			}
			case 5 -> {
				// 종료
				run = false;
			}
			}
		}
		
		
		System.out.println("프로그램 종료");
		롸
	}
}
