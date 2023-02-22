package ch05.lecture.p01array;

public class C03Array {
	public static void main(String[] args) {
		// 배열 만들고 값 할당
		/*int[] arr1 = new int[3];
		arr1[0] = 9;
		arr1[1] = 7;
		arr1[2] = 5;*/
		int[] arr1 = {9,7,5};
		System.out.println(arr1[0]);
		
		// 배열 만들 때 초기값 생성
		int[] arr2 = new int[] {99, 77, 55}; //중괄호 안에 바로 값 할당 원소의 개수가 즉 길이가 되므로 정해줄 필요x
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		
		int[] arr3;
		arr3 = new int[] {10, 20, 30, 40, 50};
		
		for(int i = 0; i < 4; i++) {
			System.out.println(arr3[i]);
		}
		
	}
}
