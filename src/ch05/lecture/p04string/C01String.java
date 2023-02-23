package ch05.lecture.p04string;

public class C01String {
	public static void main(String[] args) {
		int a = 3;
		int[] arr = new int[] {3, 3};
		
		//String은 기본 타입이 아니라 참조타입이므로 new 연산자가 꼭 필요
		
		/*String str1;
		str1 = new String("hello");*/
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		String str3 = str2;
		
		System.out.println(str1 == str2); //false
		System.out.println(str2 == str3); //true
	}
}
