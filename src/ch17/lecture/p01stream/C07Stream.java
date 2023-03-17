package ch17.lecture.p01stream;

import java.util.stream.*;

public class C07Stream {
	public static void main(String[] args) {
		// IntStream : 일반 스트림에는 없고 int 스트림에만 있음
		//첫번째 파라미터 : 시작 값(포함), 두 번째 파라미터 : 종료 값(포함x) //0~9
		//api 보고 확인
		IntStream stream1 = IntStream.range(0, 10); 
		//System.out.println(stream1.count());
		
		IntStream stream2 = IntStream.rangeClosed(0, 10); //0~10
		System.out.println(stream2.count());
	}
}
