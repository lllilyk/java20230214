package ch15.lecture.p03set;

import java.util.*;

public class C02Iterator {
	public static void main(String[] args) {
		// iterator
		// collection 탐색을 위한 객체의 타입
		// collection : 객체들을 담고 있는 객체
		// hasNext : 다음 탐색할 원소가 있는지를 boolean 타입으로 리턴
		// next : 다음 원소 리턴
		
		Set<String> set = new HashSet<>();
		set.add("java");
		set.add("css");
		set.add("spring");
		set.add("jsp");
		set.add("html");
		
		// remove : 특정 element 지우기
		
		// 조건에 따른 원소 지우기

		// 향상된 for문 사용시 set이 변경되면 exception발생
		// 지우는 목적으로 탐색하는 것에 향상된 for문 사용 어려움
		/*
		for (String e : set) {
			if (e.length() % 2 == 0) {
				set.remove(e);
			}
		}
		*/
		
		// 따라서 지우는 목적으로 탐색한다면 Iterator.remove() 사용
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String n = iter.next();
			
			if((n.length() % 2) == 0) {
				iter.remove();
			}
		}
		
		System.out.println(set);
	}
}


//comparater는 주로 파라미터로 사용되는 인터페이스
//comparable는 implements로 쓰이는 인터페이스
//comparable이 되어 있으면 natural order니까 비교 가능한데 
//string 타입은 또 예외임 comparable이 자동 되어있음
//implements comparable 안되어 있으면 comparater로 해줘야 가능

