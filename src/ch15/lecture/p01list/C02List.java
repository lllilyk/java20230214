package ch15.lecture.p01list;

import java.util.*;

public class C02List {
	public static void main(String[] args) {
		//list 전체 탐색
		List<String> list = new ArrayList<>();
		list.add("java");
		list.add("css");
		list.add("html");
		list.add("spring");
		list.add("react");
		
		//for : index 필요할 때
		System.out.println("for-------------------------");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//향상된 for : index 필요 없을 때
		System.out.println("향상된 for------------------");
		for(String e : list) {
			System.out.println(e);
		}
		
		//iterator : 탐색하고싶을때
		System.out.println("Iterator--------------------");
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
		//forEach 메소드 : list의 아이템을 for문을 통해 하나씩 건네줌("java", "css",...)
		System.out.println("forEach 메소드-------------");
		list.forEach(e -> System.out.println(e));
		
		//forEach 메소드
		System.out.println("forEach 메소드-------------");
		list.forEach(System.out::println); //36번째 코드랑 같음
	}
}
