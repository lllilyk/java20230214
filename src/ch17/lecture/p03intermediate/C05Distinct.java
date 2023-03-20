package ch17.lecture.p03intermediate;

import java.util.*;
import java.util.stream.*;

public class C05Distinct {
	public static void main(String[] args) {
		// 1~45 중 6개 랜덤
		
//		Stream<Integer> stream = Stream.generate(() -> 3); //3이라는 아이템을 계속 생성해내는 메소드(generate)
		
//		stream.forEach(System.out::println); //무한 3
		
		//1~45 숫자 무한 반복
		Stream<Integer> stream = Stream.generate(() -> (int)(Math.random() * 45) + 1); 
	
		//6개만
		stream.distinct() //중복 제거
				.limit(6) //6개로 제한
				.forEach(System.out::println); //forEach 실행시 distinct와 limit 한번에 실행
		
		//Random Class 사용
		System.out.println("##random class####");
		Random random = new Random();
		
		Stream.generate(() -> random.nextInt(45) + 1)
			.distinct()
			.limit(6)
			.forEach(System.out::println);
	
	}
}
