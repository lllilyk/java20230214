package ch05.lecture.p06for;

public class ExerciseEnhancedFor8198 {
	public static void main(String[] args) {
		
		//최대값을 구해라
		
		int[] array = {1, 5, 3, 8, 2};
		
		int max = Integer.MIN_VALUE;
		
		for(int n : array) {
			if(n>max) {
				max = n;
			}
		}
		
		System.out.println(max);
		
	}
}
