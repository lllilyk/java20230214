package ch05.lecture.p08regex;

public class C26RegEx {
	public static void main(String[] args) {
		// group
		// ()
		
		String pattern1 = "(\\w\\d){2}"; //( )를 두번
		// 패턴이 복잡할 때는 둥근 괄호로 묶어서 보기 쉽게 표기하기
		System.out.println("a3_4".matches(pattern1));
		
		// 전화번호
		// 010이 있어도 되고 없어도 되고 
		// 숫자 8개 
		
		String pattern2 = "(010)?\\d{8}"; //{8}바로 앞의 \\d 즉 숫자 8개가 있는지 확인
		System.out.println("010767777777".matches(pattern2));
		System.out.println("67777777".matches(pattern2));
		
		
		
		
		
		
	}
}
