package ch17.lecture.p03intermediate;

import java.util.*;
import java.util.stream.*;

public class C04Distinct {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(3);
		list.add(1);
		list.add(0);
		list.add(0);
		
		Stream<Integer> stream1 = list.stream(); //4
		
		Stream<Integer> stream2 = stream1.distinct(); //3
		
		list.add(2);
		
		//최종연산 실행 시 중간연산이 한 번에 실행됨
		//count가 실행될 때 15, 17, 19번째 줄의 코드가 한 번에 실행됨
		long count1 = stream2.count(); //4
		System.out.println(count1);
	}
}	
