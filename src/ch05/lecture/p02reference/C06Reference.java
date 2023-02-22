package ch05.lecture.p02reference;

public class C06Reference {
	public static void main(String[] args) {
		//C04Reference랑 비교해보기
		int[] arr = new int[] {2, 4, 6};
		
		method1(arr); //이 arr 변수는 main 메소드 내에서만 해당
		System.out.println(arr[0]);
	}
	public static void method1(int[] arr) {
		arr = new int[] {3,5,7}; //이 arr 변수는 method1 메소드 내에서만 해당
		// 따라서 변수명이 같은 것일 뿐 다른 배열 변수임. 
		// method1 메소드 내에서 새로운 변수 arr에 값으로 3,5,7을 주었으므로 
		//9번째 줄의 결과는 main 메소드 내의 arr에 해당하는 2가 답
	}
}
