package ch05.lecture.p02reference;

public class C02Reference {
	public static void main(String[] args) {
		int a = 3;
		int b = a;
		
		System.out.println(a);
		System.out.println(b);
		
		a = 6;
		
		System.out.println(a);
		System.out.println(b); // 기본 타입은 값 자체를 저장하므로 b에는 영향x

		int[] arr1 = {5,6,7};
		int[] arr2 = arr1;
		
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		
		arr1[0] = 99;
		
		System.out.println(arr1[0]);
		System.out.println(arr2[0]); // 참조 타입은 값을 저장한 공간의 주소를 저장하므로 arr2에도 영향o
	
	}
}
