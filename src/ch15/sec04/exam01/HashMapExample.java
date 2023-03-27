package ch15.sec04.exam01;

import java.util.*;
import java.util.Map.*;

public class HashMapExample {
	public static void main(String[] args) {
		//Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<>();
		
		//객체 저장
		map.put("강백호", 18);
		map.put("송태섭", 18);
		map.put("정대만", 19);
		map.put("강백호", 17); //key가 같기 때문에 제일 마지막에 저장한 값만 저장
		
		System.out.println("총 Entry 수: " + map.size()); 
		System.out.println();
		
		//키로 값 얻기
		String red = "강백호";
		int hair = map.get(red);
		System.out.println(red + ": " + hair); //강백호: 17
		System.out.println();
		
		//키 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
		//키 Set 컬렉션을 얻을 때는 말그대로 전체 key값만 얻는 것이니까
		//iterator 써서 각 key값 얻어내고
		//얻은 각 key값으로 value값을 얻어내야 전체 key와 value 값을 얻을 수 있음
		Set<String> keySet = map.keySet(); 
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String k = keyIterator.next();
			Integer v = map.get(k);
			System.out.println(k + ": " + v);
		}
		System.out.println();
		
		//엔트리 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
		//엔트리 set 컬렉션을 얻을 때는 엔트리 즉, key와 value 쌍들을 다 가져오는 것이니까
		//iterator를 쓰면 각 key와 value값, 즉 엔트리 한 쌍의 값을 얻을 수 있음
		//얻어온 엔트리 값에서 key값과 value값을 각각 얻어내면 끝!
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			String k = entry.getKey();
			Integer v = entry.getValue();
			System.out.println(k + ": " + v);
		}
		System.out.println();
		
		//키로 엔트리 삭제
		map.remove("강백호");
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println();
	}
}
