package ch05.lecture.p02reference;

public class C05Reference {
	public static void main(String[] args) {
		int[] arr = {2,4,6};
		
		int[] arr2 = arr;
		
		System.out.println("1 : " + arr2[0]);
		
		arr = new int[] {2, 4, 6}; //배열을 만들 새로운 공간을 생성하라
		System.out.println("2 : " + arr[0]);
		arr[0] = 20;
		System.out.println("3 : " + arr[0]);
		System.out.println("4 : " + arr2[0]);
	} 
}
