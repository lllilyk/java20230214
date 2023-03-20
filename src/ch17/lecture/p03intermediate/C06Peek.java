package ch17.lecture.p03intermediate;

import java.util.*;

public class C06Peek {
	public static void main(String[] args) {
		(new Random()).ints(5)
				// peek : 중간에 값들이 잘 들어가서 처리되고 있는지 디버깅하는 용도로 쓰임
				.peek(System.out::println) // 각 원소가 한 번 걸러짐 - 중간연산이니까 forEach 실행될 때 한번에 실행됨
				.forEach(System.out::println);
	}
}
