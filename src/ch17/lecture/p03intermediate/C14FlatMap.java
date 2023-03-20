package ch17.lecture.p03intermediate;

import java.util.*;
import java.util.stream.*;

public class C14FlatMap {
	public static void main(String[] args) {
		//flatMap: 
		//원래 원소를 다른 원소'들'로 매핑
		
		List<Integer> list = List.of(3, 4, 5);
		
		//map : 1 대 1
		long count1 = list.stream()
			.map(e -> e)
			.count();
		System.out.println(count1); //매핑한 후에도 3개로 개수 동일
		
		//flatMap : 1 대 다(0~?)
		long count2 = list.stream()
			.flatMap(e -> Stream.of(0, 0)) //어떤 원소를 넣으면 두개의 원소를 가진 스트림을 리턴하도록
			.count();
		
		System.out.println(count2); //3 * 2 //6개
		
		
	}
}
