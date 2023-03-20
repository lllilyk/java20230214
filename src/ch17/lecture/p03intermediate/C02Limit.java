package ch17.lecture.p03intermediate;

import java.util.*;
import java.util.stream.*;

public class C02Limit {
	public static void main(String[] args) {
		//limit 중간 연산 : 크기 제한
		
		List<String> list = List.of("java", "css", "html", "spring", "jsp");
		
		//stream을 원소로 가지고 있는 stream
		//코드 작성 순으로 실행 x , 최종연산인 count가 실행될 때 한 번에 코드가 실행됨
		Stream<String> stream1 = list.stream();
		Stream<String> stream2 = stream1.limit(3); // 스트림 원소 중 3개로 제한
		
		long count = stream2.count();
		System.out.println(count);
		
		//중간연산과 최종연산
		//어차피 한번에 실행되니까 처음부터 method chaining하기
		long count2 = list.stream()
			.limit(3)
			.count();
		
		System.out.println(count2);
	}
}
