package ch17.exercise.exam06;

import java.util.*;
import java.util.stream.*;

public class Example {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", 30),
				new Member("신용권", 40),
				new Member("김자바", 26)
				);
		
		//for문 사용
		System.out.println("for문 사용");
		double sum = 0;
		for(Member member : list) {
			sum += member.getAge();
		}
		double avg = sum / list.size();
		System.out.println(avg);
	
		System.out.println("stream, collect 사용");
		//참조타입 stream 사용
		double avg3 = list.stream()
			.collect(Collectors.averagingDouble(Member::getAge));
		System.out.println(avg3);
		
		System.out.println("Intstream, average 사용");
		//기본타입 stream 사용
		double avg2 = list.stream()
				.mapToInt(Member::getAge)
				.average()
				.getAsDouble();
		
		System.out.println("평균 나이: " + avg2);
	}
}
