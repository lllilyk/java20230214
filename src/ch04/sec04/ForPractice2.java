package ch04.sec04;

import java.util.Scanner;

public class ForPractice2 {
	public static void main(String[] args) {
		//문제 1
//		Scanner scanner = new Scanner(System.in);
		/*
		int n = scanner.nextInt();
		
		for(int i = 0; i < n ; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}*/
		
		
		/*문제 2
		Scanner scanner1 = new Scanner(System.in);
		int a = scanner1.nextInt();
		
		for(int b = 1; b <= a; b++) {
			for(int c = 1; c <= b; c++) {
				System.out.print(c);
			}
			System.out.println();
		}*/
		
		// 문제 3
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		for(int f = (h-1); f >= 0; f--) {
			for(int g = f; g >=0; g--) {
				System.out.print(g);
			}
			System.out.println();
		}
		
		/*Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		for(int i = a; i >= 0; i--){
		   for(int j = (i-1); j >= 0; j--){
		      System.out.print(j);
		   }
		   System.out.println();
		}*/
	}
}
