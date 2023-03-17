package ch17.lecture.p01stream;

import java.util.*;
import java.util.stream.*;

public class C06Stream {
	public static void main(String[] args) {
		// 원소가 참조 타입인 스트림
		Stream<String> stream1 = Stream.of("java", "spring", "css");
	
		// 원소가 기본 타입인 스트림
		IntStream stream2 = IntStream.of(3, 8, 10, 1);
		LongStream stream3 = LongStream.of(100, 200, 300);
		DoubleStream stream4 = DoubleStream.of(3.14, 9.8, 7.1, 12.12);
		
		int[] intarr = {9, 10, 11, 12};
//		Arrays.stream(intarr); //IntStream이 리턴됨
		IntStream stream5 = Arrays.stream(intarr);
//		Stream<Integer> stream6 = Arrays.stream(intarr);//x IntStream 타입으로 받아야 함
	
	//stream은 원소의 순차적 처리를 위한 기능을 가진다. 끝
	
	
	}
}
