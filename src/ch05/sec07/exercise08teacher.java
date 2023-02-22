package ch05.sec07;

public class exercise08teacher {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double cnt = 0;
		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i].length);
//			cnt += array[i].length;
			for (int j = 0; j < array[i].length; j++) {
//				System.out.println(array[i][j]);
				sum += array[i][j];
				cnt++;
			}
		}
		
		System.out.println(sum);
		System.out.println(sum / cnt);
	}
}