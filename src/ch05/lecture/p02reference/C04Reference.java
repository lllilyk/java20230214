package ch05.lecture.p02reference;

public class C04Reference {
	public static void main(String[] args) {
		int[] arr = new int[] {3,4,5}; //1번
		
		method1(arr); 
		System.out.println(arr[0]);//5번
	}
	
	public static void method1(int[] arr2) { //arr이 가지고 있는 값이 arr2에 복사됨 : 같은 주소(instance)를 가리킴
		System.out.println(arr2[0]);//2번
		arr2[0] = 30;//3번
		System.out.println(arr2[0]);//4번
	}
}
