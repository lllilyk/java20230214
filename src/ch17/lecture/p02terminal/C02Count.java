package ch17.lecture.p02terminal;

import java.util.*;
import java.util.stream.*;

public class C02Count {
	public static void main(String[] args) {
		// count
		IntStream stream1 = IntStream.range(0, 100);

		long count1 = stream1.count();
		//System.out.println(count1);

		List<String> list = List.of("java", "css", "spring");
		Stream<String> stream2 = list.stream();
		long count2 = stream2.count();

		System.out.println(count2);

		//위의 코드를 간결하게 작성
		long count3 = list.stream().count();
		System.out.println(count3);

		//method chaining
		//코드 길어지면 중간연산자 앞에서 끊어주기
		long count4 = list.stream()
				.map(s -> s + s)
				.filter(s -> s.startsWith("c"))
				.count();
		System.out.println(count4);
		
	}
}
