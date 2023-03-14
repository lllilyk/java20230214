package ch15.sec02.exam03;

import java.util.*;

public class LinkedListExample {
	public static void main(String[] args) {
		//ArrayList 컬렉션 객체 생성
		List<String> list1 = new ArrayList<String>();
		
		//LinkedList 컬렉션 객체 생성
		List<String> list2 = new LinkedList<String>();
		
		
		//시작 시간과 끝 시간을 저장할 변수 선언
		long startTime;
		long endTime;
		
		//ArrayList
		//element가 추가되면 다른 index의 element들이 다 움직임
		//ArrayList 컬렉션에 저장하는 시간 측정
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "ArrayList 걸린 시간: ", (endTime-startTime));
		
		//LinkedList
		//element가 추가되어도 다른 index의 element들에는 영향x	
		//LinkedList 컬렉션에 저장하는 시간 측정
		startTime = System.nanoTime();
		for(int i = 0; i<10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "LinkedList 걸린 시간: ", (endTime-startTime));
	}
} 
