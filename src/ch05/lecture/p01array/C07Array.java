package ch05.lecture.p01array;

public class C07Array {
	public static void main(String[] args) {
		int a = 3;
		int b;
		
		b = a;
		
		System.out.println(a);
		System.out.println(b);
		
		a = 6;
		
		System.out.println(a);
		System.out.println(b); //저장소에 있는 값은 변하지않음
		
		int[] arr1 = {5,6,7};
		int[] arr2;
		arr2 = arr1; // arr2값이 arr1값을 참조하겠다는 의미
		// arr1의 값이 변경되면 arr2의 값도 변경되므로 값이 변하는 것을 원하지 않으면 이렇게 하면 안됨
		
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		
		arr1[0] = 50;
		
		System.out.println(arr1[0]);
		System.out.println(arr2[0]); //영향을 받아서 같이 변경됨
		
	}
}
