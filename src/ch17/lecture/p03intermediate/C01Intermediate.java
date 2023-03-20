package ch17.lecture.p03intermediate;

public class C01Intermediate {
	public static void main(String[] args) {
		// 스트림 API
		// 1. 최종 연산(Terminal)
		// 리턴 타입 : Stream 아님
		
		// 2. 중간 연산(Intermediate)
		// 리턴 타입 : Stream
		// distinct : 중복 제거
		// limit : 크기 제한
		// sorted : 정렬
		// filter : 필터링(솎아내기)
		// map : 매핑(다른 원소로 매핑) 1->1
		// flatmap : 매핑(다른 원소들로 매핑) 1->n
		// boxed : 기본 타입 스트림 -> 참조 타입 스트림으로 변환
		// peek : 중간 처리 연산 (forEach: 최종 처리 연산과 비교됨)
	}
}
