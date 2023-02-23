package ch05.sec05;

public class C03Split {
	public static void main(String[] args) {
		// split
		// 특정 문자 패턴으로 문자열을 나누어서 배열로 리턴
		
		String str1 = "hello, java, world, html, css";
		String[] arr1 = str1.split(","); // str1을 ,를 기준으로 나누고싶다.
		
		System.out.println(arr1.length);
		System.out.println(arr1[0]);
		System.out.println(arr1[4]);
		
		String str2 = "spring react wue angular jsp sass";
		String[] arr2 = str2.split(" ");
		
		System.out.println(arr2.length);
		System.out.println(arr2[3]);
		System.out.println(arr2[arr2.length -1]);
		
		String str3 = "I'm ironman.";
		String[] arr3 = str3.split("");
		
		System.out.println(arr3.length); //배열의 길이를 구할때는 .length 기본 타입의 길이를 구할때는 .length()
		System.out.println(arr3[0]);
		System.out.println(arr3[arr3.length -1]);
		
		String menu = "americano latte chocolate cappuccino mocha";
		String[] select = menu.split(" ");
		System.out.println(select[2]);
		System.out.println(select[select.length-1]);
	}
}
