package codetest.backjoon;

import java.util.Scanner;

public class Solution1152 {
	public static void main(String[] args) {
		//단어의 개수 출력하기
		
//		String board = "The Curious Case of Benjamin Button";
//		String[] arr = board.split(" ");
//		System.out.println(arr.length);
//		
//		String board1 = " The first character is a blank";
//		String[] arr1 = board1.split(" ");
//		System.out.println(arr1.length); //trim 이용해보기
//		
//		String board2 = "The last character is a blank ";
//		String[] arr2 = board2.split(" ");
//		System.out.println(arr2.length); //빈문자열 찾아서 빼기
		
		
		//선생님 코드 보기
		/*String input3 = " The first character is a blank";
		Scanner scanner = new Scanner(input3);
		
		String line = scanner.nextLine();
		
		String[] arr = line.split(" "); //split으로 구분하고 배열 생성
		int answer = 0;
		
		System.out.println(arr.length); //공백 다음에 끝인경우에는 빈문자열로 인식하지x
		
		for (int i = 0; i< arr.length; i++) {
			if (!arr[i].equals("")) { //!(not : 논리부정) : 피연산자의 논리값을 바꿈 // 즉 arr[i]가 빈문자열이 아니면 answer에 1씩 추가해라
				answer++;
			}
		}
		
		System.out.println(answer);*/
		
		
		//단어의 개수 출력하기
		String question = " The first character is a blank";
		Scanner scanner = new Scanner(question);
		
		String line = scanner.nextLine();
		//System.out.println(line);
		
		String[] want = line.split(" ");
//		System.out.println(want[1]);
		
		int answer = 0;
		
		for(int i = 0; i < want.length; i++) {
			if(!want[i].equals("")) { //참조타입에서 값을 비교할때는 equals메소드 사용
				answer++;
			}
		}
		System.out.println(answer);
	}
}
