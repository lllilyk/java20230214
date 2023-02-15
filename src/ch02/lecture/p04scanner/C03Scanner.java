package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C03Scanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째값 입력>");
		String str1 = scanner.nextLine(); 
		
		System.out.println("두번째값 입력>");
		String str2 = scanner.nextLine();
		
		
		//위에서 string으로 받았는데 연산을 하고싶은 경우 그냥 두면 연결연산자로 계산되니까 바꿔주어야 함. 
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		System.out.println(num1 + num2);
		
		//
//		public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("x값 입력: ");
//		String strX = scanner.nextLine();
//		int x = Integer.parseInt(strX);
//		
//		System.out.println("y값 입력: ");
//		String strY = scanner.nextLine();
//		int y = Integer.parseInt(strY);
//		
//		int result = x + y;
//		System.out.println("x + y: " + result);
//		System.out.println();
//		
//		while(true) {
//			System.out.println("입력 문자열: ");
//			String data = scanner.nextLine();
//			if(data.equals("q")) {
//				break;
//			}
//		System.out.println("출력 문자열: " + data);
//		System.out.println();
//		}
//		System.out.println("종료");
//		
//		
//		
//	}

}
}