package ch17.lecture.p03intermediate;

import java.util.stream.*;

public class C12Map {
	public static void main(String[] args) {
		
		// 기본타입 int가 원소인 스트림을
		IntStream stream1 = IntStream.range(11, 20);
		
		// 참조타입 Integer가 원소인 스트림으로 변환하고 싶다!
		//Stream<Integer> stream2 = stream1;
		Stream<Integer> stream2 = stream1.mapToObj(Integer::valueOf);
		
		//mapToObj : 어떤 타입으로든 변환 가능
		
		long count = stream2.count();
		System.out.println(count);
		
		//꼭 Integer로 바꾸고 싶은 경우
		//boxed 메소드 사용
		
	}
}
