package ch15.lecture.p01list;

import java.util.*;

public class C01List {
	// java.util.List
	// 순서가 있는 collection(어떤 객체를 담고 있는 객체)
	// 순서가 있으므로 각 아이템(element : 원소)은 index로 접근 가능
	
	public static void main(String[] args) {
		//새 리스트 만들기
		List<String> list = new ArrayList<String>();
		List<Integer> list1 = new ArrayList<Integer>();
//		List<String> list = new ArratList<>();
//		var list = new ArrayList<String>();
	
		//element 추가
		//순서가 있기 때문에 중복되는 원소 추가해도 상관x
		list.add("java");
		list.add("css");
		list.add("spring");
		list.add("java");
		
		String s = "summer";
		list.add(s);
		
		list1.add(1);
		list1.add(3);
		list1.add(100);
		list1.add(1);

		int a = 5;
		list1.add(a);
	
		//element 얻기
		String e1 = list.get(0);
		String e2 = list.get(1);
		String e3 = list.get(2);
		String e4 = list.get(3);
		String e5 = list.get(4);
		//System.out.println(e5);
		
		// list 크기
		int size = list.size();
		//System.out.println("list의 크기: " + size);
	
		// 특정 index의 element 지우기
		// 지운 후 오른쪽의 값이 왼쪽에 채워짐 4번 //인덱스가 지워지면 5번 인덱스가 4번인덱스로 바뀜
		list.remove(2);
		System.out.println("지운후 크기 : " + list.size()); //3
		System.out.println("지운후 2번 index의 값: " + list.get(2)); //java
		
		
		// 특정 index의 값 바꾸기
		list.set(2, "react");
		String s1 = list.get(2);
		System.out.println(s1);
		
		list.set(3, "winter");
		String s2 = list.get(3);
		System.out.println(s2);
		
	}
	
}
