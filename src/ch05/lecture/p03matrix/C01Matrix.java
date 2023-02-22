package ch05.lecture.p03matrix;

public class C01Matrix {
	public static void main(String[] args) {
		// 2차원 배열 (행렬)
		
		int[][] arr = new int[3][]; // 행의 길이는 앞[]에
		System.out.println(arr.length);
	
		arr[0] = new int[] {1,3,5,7};
		arr[1] = new int[] {2,4,8,10};
		arr[2] = new int[] {9,10,11,12};
	
		System.out.println();
		System.out.println(arr[0][0]); // 즉 1행 1열에 있는 값
		System.out.println(arr[1][1]); // 즉 2행 2열에 있는 값
		System.out.println(arr[1][2]); // 즉 2행 3열에 있는 값
		System.out.println(arr[2][3]); // 즉 3행 4열에 있는 값
		
		System.out.println("전체탐색 for");
		for(int i = 0; i < arr.length; i++) { //arr.length는 3인걸 위에서 알 수 있음
			for (int j =0; j < arr[i].length; j++) { // arr[i].length는 arr[0].length 는 4,  arr[1].length 는 4,  arr[2].length 는 4
				System.out.println(arr[i][j]); //i는 행 j는 열
			}
		}
		
	}
}
