package codetest.programmers;

import java.util.Scanner;

public class Solution120823 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력>");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) { //변수 초기화 까먹지 말기!!!!!!!

			for (int j = 0; j <= i; j++) {
				System.out.print("*"); //*를 출력해야하니까
			}
			System.out.println(); //줄을 구분하기 위해서
			// 전체 반복문 안에 있어야 반복해서 다음줄을 출력하면서 줄을 구분할 수 있음
		}

	}
}