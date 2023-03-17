package ch17.lecture.p01stream;

import java.util.stream.*;

public class C01Stream {
	public static void main(String[] args) {
		//여러 원소(element)의
		//순차적 처리 기능(메소드)을 제공하는 Class, Interface
		
		//스트림 만들기
		Stream<Integer> stream1 = Stream.of(5, 1, 3, 9, 10, 0);
		
		//스트림 메소드 (연산)
		//Api 보고 확인
		//1. 최종 연산(terminal operation)
		//   리턴 타입: Stream 아닌 다른 값을 리턴
		//   최종 연산시 중간연산도 같이 실행됨
		
		//개수 세기(count)
		//count 메소드는 long 타입을 리턴하므로 최종 연산.
		stream1.count(); 

		//최종 연산 후 재사용 불가
//		stream1.findFirst(); //오류 발생 
		
		//2. 중간 연산(intermediate operation)
		//   최종 연산시 한꺼번에 실행됨
		//   리턴 타입: Stream(또 다른 Stream을 리턴)
		
	}
}
