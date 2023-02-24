package ch05.sec10;

public class AdvancedForExcercies8199 {
	public static void main(String[] args) {
		
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0;
		int cnt = 0; 

		
		for(int[] brray : array) { //brray라는 배열에 담길 array의 배열(원소)이 총 3개니까 3번 반복
			for(int n : brray) { //brray에 담은 10개의 원소를 하나하나꺼내서 sum에 더하도록
				sum += n;
				cnt++;
			}
		}
		
		avg = (double) sum / cnt;
		
		System.out.println("합: " + sum);
		System.out.println("평균: " + avg);
	}
}
