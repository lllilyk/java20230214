package ch05.lecture.p08regex;

public class C18RegEX {
	public static void main(String[] args) {
		// 특수기호
		// Predefined character classes
		// 숫자
		String pattern1 = "[0-9]";
		String pattern2 = "\\d"; // \d 자바에서 숫자를 나타내고 싶은 경우 역슬래시(\) 두 번 써줘야함
		
		System.out.println("0".matches(pattern1));
		System.out.println("0".matches(pattern2));
		
		System.out.println("19990112".matches("[0-9]{8}"));
		System.out.println("19990112".matches("\\d{8}"));
		
		// 전화번호
		// 010으로 시작, - 하나 있거나 없거나, 숫자 4개, - 하나 있거나 없거나, 숫자 4개 로 이루어진 패턴의 문자를 검사하고 싶은 경우
		String number1 = "01099999999";
		String number2 = "010-49999999";
		String number3 = "010-5999-9999";
		
		String pattern3 = "010-?[0-9]{4}-?[0-9]{4}";
//		String pattern3 = "010-?\\d{4}-?\\d{4}";
		
		System.out.println(number1.matches(pattern3));
		System.out.println(number2.matches(pattern3));
		System.out.println(number3.matches(pattern3));
		
		
	}
}
