package ch17.sec06.exam01;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		//List 컬렉션 생성
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("홍길동", 85));
		studentList.add(new Student("홍길동", 92));
		studentList.add(new Student("홍길동", 87));
		
		//Student를 score 스트림으로 변환
		studentList.stream()
			.mapToInt(s -> s.getScore()) //참조타입이 아닌 기본 타입 int로 매핑
			.forEach(score -> System.out.println(score));
		
		// Intstream 관련된 메소드 사용해서
		// 최대 점수---------------------------------
		int max = studentList.stream()
			.mapToInt(Student::getScore)
			.max()
			.getAsInt();
		
		System.out.println(max);
		
		// 최소 점수----------------------------------
		int min = studentList.stream()
				.mapToInt(Student::getScore)
				.min()
				.getAsInt();
		
		System.out.println(min);
		
		// 총합--------------------------------------!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		int sum = studentList.stream()
				.mapToInt(Student::getScore)
				.sum();
		
		System.out.println(sum);
		
		// 평균-------------------------------------
		double avg = studentList.stream()
				.mapToInt(Student::getScore)
				.average()
				.getAsDouble();
		
		System.out.println(avg);
		
		// 통계------------------------------------
		IntSummaryStatistics summary = studentList.stream()
			.mapToInt(Student::getScore)
			.summaryStatistics();
		
		System.out.println(summary);
		
		System.out.println("최대 : " + summary.getMax());
		System.out.println("최소 : " + summary.getMin());
		System.out.println("합 : " + summary.getSum());
		System.out.println("평균 : " + summary.getAverage());	
	}
}
