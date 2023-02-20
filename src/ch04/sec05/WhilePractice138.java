package ch04.sec05;

public class WhilePractice138 {
	public static void main(String[] args) {

	
//		이런 방법도 있음
//	int sum = 0;
//	int i = 0;
//	
//	while(i <= 100) {
//		if ((i % 3) == 0) {
//			sum += i;
//		}
//		i ++;
//	}
	
	// 선생님 코드
		int sum = 0;
		int i = 0;
		
		while(i <= 100){
			sum += i;
			i += 3;
		}
		System.out.println(sum);
		
	}
}
