package ch05.lecture.p04string;

public class C02String {
	public static void main(String[] args) {
		String str1 = new String("java");
		String str2 = "java"; //new 연산자 생략가능
		String str3 = "java"; //new 연산자를 생략하며 이미 있는 str2의 java값을 그대로 사용
		
		System.out.println(str2 == str3); //true
		System.out.println(str1 == str2); //false
	
		//문자열이 같은지 확인
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
	
	
	
	}
}
