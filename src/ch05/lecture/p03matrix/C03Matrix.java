package ch05.lecture.p03matrix;

public class C03Matrix {
	public static void main(String[] args) {
		int[] arr1 = new int[] {2, 3, 4, 5};
		
		//아예 처음부터 값 할당
		int[][] mat1 = new int[][] { //new int 연산자를 생략하지 않은 정석버전
			new int[] {3,4,5,7},
			new int[] {10, 11, 12, 13},
			new int[] {9,8,7,6}
		};
		
		// 전체 매트릭스 값을 확인하려면 for중첩문 작성
		for(int i = 0; i < mat1.length; i++) {
			for(int j = 0; j < mat1[i].length; j++) {
				System.out.println(mat1[i][j]);
			}
		}
		
		// new int 연산자 생략 가능
		int[] arr2 = {2, 3, 4, 5};
		int[][] mat2 = {
				{3,4,5,7},
				{10,11,12,13},
				{9,8,7,6}
		};
		
		
		//안에 있는 원소의 길이가 꼭 같을 필요x
		int[][] mat3 = {
				{1,2,3,4},
				{10,20},
				{99,100,101}
		}; //행렬로 보긴 어렵고 배열의 배열
	}
}
