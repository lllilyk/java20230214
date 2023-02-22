package ch05.lecture.p01array;

public class C08ArrayCopy {
	public static void main(String[] args) {
		int[] arr1 = {3, 4, 5};
//		arr1[3] = 9; // 실행중(runtime exception);
		
//		System.out.println("다음 실행 흐름.");
		
		int[] arr2 = {10, 20, 30};
		int[] arr3 = new int[arr2.length];//arr3 배열의 아이템은 총 3개라고 정해준 것
		
		for (int i = 0; i < arr2.length; i++) {
			arr3[i] = arr2[i];
		} // int[] arr3 = {10, 20, 30};이다. 라는 의미
		
		System.out.print(arr2[0]);
		System.out.print(arr2[1]);
		System.out.print(arr2[2]);
				
		System.out.println();

		System.out.print(arr3[0]);
		System.out.print(arr3[1]);
		System.out.print(arr3[2]);
		
		System.out.println();
		arr2[0] = 100;
		
		System.out.println(arr2[0]);
		System.out.println(arr3[0]); 
		// arr3에 new int를 적음으로써 arr2의 값이 저장된 곳에 저장하는 것이 아니라 새로운 공간에 값을 저장하겠다고 한 것. 
		//arr2[0]의 값이 변경되어도 영향받지x
	}
}
