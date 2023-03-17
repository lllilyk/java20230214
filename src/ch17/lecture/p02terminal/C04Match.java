package ch17.lecture.p02terminal;

import java.util.*;

public class C04Match {
	public static void main(String[] args) {
		//match
		//allMatch
		//anyMatch
		//noneMatch
		//리턴 타입 : boolean 타입 
		
		List<Integer> list = List.of(1, 2, -3, 4, 0);
		
		boolean r1 = list.stream().allMatch(e -> e > 0); //다 양수인지 확인
		System.out.println(r1);
		
		boolean r2 = list.stream().anyMatch(e -> e < 0); //음수가 있는지 확인
		System.out.println(r2);
		
		boolean r3 = list.stream().noneMatch(e -> e < 0); //음수가 하나도 없는지 확인
		System.out.println(r3);		
		

		
	}
}
