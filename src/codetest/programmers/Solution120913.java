package codetest.programmers;

public class Solution120913 {
	public static void main(String[] args) {
		
		//예제 1만 정답맞추기가 목표
		// 기존의 생각 : 정답을 담을 result 배열에 6개의 값만 담겠다고 설정
		// count값-1만큼 반복문을 실행 : 총 3번
		// 위에서 6개까지만 담겠다고 했으니까 result를 3번 더해서 정답을 만들겠다. 
		
		String str = "abc1Addfggg4556b";
		
		String result = "";
		
		System.out.println(str.length());
		
		int count = 0;
		
		if((str.length()%6) == 0) {
			count = str.length()/6;
		} else {
			count = str.length()/6 + 1;
		}
		System.out.println(count);
		
		for(int i = 0; i < count; i++) {
			
			result = str.substring(i*6);
			System.out.println(result); 
			
		}
	}
}
