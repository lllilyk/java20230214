package ch15.lecture.p02collections;

import java.util.*;

public class C01Collections {
	
	public static void main(String[] args) {
		//수정불가 리스트
		//of메소드로 만든 list는 변경 불가
		List<String> list1 = List.of("java", "css", "spring", "jsp", "html");

		//수정가능 리스트로 다시 만듬
		List<String> list2 = new ArrayList<>(list1);
		
		//sort 
		//Sorts the specified list into ascending order, according to the natural ordering of its elements.
		Collections.sort(list2); 
		System.out.println(list2);
		
		//max
		//변경할 필요 없으니까 list1이용
		String maxStr = Collections.max(list1);
		System.out.println(maxStr);
		
		//min
		String minStr = Collections.min(list1);
		System.out.println(minStr);

		//reverse : Reverses the order of the elements in the specified list.
		Collections.reverse(list2);
		System.out.println(list2);
	
		//fill : Replaces all of the elements of the specified list with the specified element.
		Collections.fill(list2, "spring");
		System.out.println(list2);
	}
}
