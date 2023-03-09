package ch12.lecture.p01object;

import java.util.*;

public class C23HashCodeEquals {
	public static void main(String[] args) {
		// 중복 없는 원소의 모임(Collection)
		
		// set은 인터페이스이기 때문에 인스턴스를 만드려면 구현클래스를 이용해야함
		// 자주쓰는 클래스에 HashSet이 있음
		Set set = new HashSet();
		
		System.out.println(set.size());

		set.add(100);
		System.out.println(set.size()); //하나의 원소가 들어갔으니까 set의 크기는 1
		
		set.add(200);
		System.out.println(set.size()); //하나의 원소가 더 들어갔으니까 set의 크기는 2
		
		set.add(100);
		System.out.println(set.size()); 
		//하나의 원소가 더 들어갔지만 중복이므로 set의 크기는 커지지 않고 2
		//중복이 아닌 경우(존재하지 않는 경우)에만 추가
	}
}

