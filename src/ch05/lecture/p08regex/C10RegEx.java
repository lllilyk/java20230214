package ch05.lecture.p08regex;

public class C10RegEx {
	public static void main(String[] args) {
		//quantifier (수량자 : 수량을 표시하는 문자)
		
		// 숫자 3개인가?
		System.out.println("010".matches("[0-9][0-9][0-9]")); //true
		System.out.println("123".matches("[0-9]{3}")); //true []패턴을 3번
		System.out.println("12".matches("[0-9]{3}")); // {} : 직전에 있는 패턴이 몇 번 반복되는지 반복횟수
		System.out.println("1234".matches("[0-9]{3}")); //true
		System.out.println("ab0".matches("[0-9]{3}")); //true
		
		
	}
}
