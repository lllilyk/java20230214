package ch02.lecture.p05print;

import java.util.Scanner;

public class C08Print {
	// 백준 11021
	public static void main(String[] args) {
		String input = """
				5
				1 1
				2 3
				3 4
				9 8
				5 2
				""";

		Scanner scanner = new Scanner(input);
		int loop = scanner.nextInt();

		for (int i = 1; i <= loop; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();

//			System.out.printf("Case #%2$d: %1$d%n", (a + b), i); //몇 번째 줄인지 나타내는 i 즉, 2번인덱스를 첫번째 argument위치에 넣겠다. 
			System.out.println("Case #" + i + ":" + (a + b)); // 연결연산자가 더 편하면 이렇게!
		}
	}
}