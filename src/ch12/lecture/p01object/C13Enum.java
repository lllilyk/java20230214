package ch12.lecture.p01object;

public class C13Enum {
	public static void main(String[] args) {
		Season season = Season.FALL;
		
		String a = switch (season) {
		case SPRING, FALL -> "좋은 계절이다.";
		case SUMMER -> "덥다";
		case WINTER -> "춥다";
		// default -> 여기서는 default를 생략해도 됨 
		// 계절은 4개밖에 없으니까
		};
		
		System.out.println(a);
	}
}
