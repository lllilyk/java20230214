package ch15.lecture.p03set;

import java.util.*;

public class C01Set {
	public static void main(String[] args) {
		//set : 순서없음, 중복안됨
		Set<Integer> set = new HashSet<>();
		
		//넣은 순서와 set의 순서는 상관없음
		//index 없음(순서x)
		//add element
		set.add(30);
		set.add(90);
		set.add(3);
		set.add(7);
		set.add(90); //안 들어감
		
		//size 크기
		int size = set.size();
		System.out.println(size); //중복 허용 안되니까 5개 아니고 4
		System.out.println(set);
		
		//remove
		set.remove(3);
		System.out.println(set.size());
		System.out.println(set);
		
		//전체 탐색
		//index가 없기 때문에 for문으로는 전체 탐색 불가
		System.out.println("향상된 for-------------");
		for(Integer e : set) {
			System.out.println(e);
		}
		
		System.out.println("Iterator---------------");
		//탐색하기 위해서 만들어진 인터페이스 
		//hasNext() : 탐색할 다음 element가 있는지 true false
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());			
		}
		
		System.out.println("forEach------------");
		set.forEach(e -> System.out.println(e));
		
		System.out.println("forEach-------------");
		set.forEach(System.out::println);
	}
}
