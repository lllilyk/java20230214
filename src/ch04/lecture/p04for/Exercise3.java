package ch04.lecture.p04for;

public class Exercise3 {
	public static void main(String[] args) {
		
		// 1~100까지 3의 배수의 총합
		
		int sum = 0;
		int i = 0;
		
		for(i = 0; i <=100; i+= 3) {
			sum += i;
		} 
		System.out.println(sum);
	}
}
