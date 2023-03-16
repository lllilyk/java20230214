package ch15.sec04.exam01;

import java.util.*;
import java.util.Map.*;

public class HashMapExample {
	public static void main(String[] args) {
		//Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<>();
		
		//객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95); //키는 중복 저장 불가. 값만 기존의 값이 새로운 값으로 대치됨
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println();
		
		//키로 값 얻기
		String key = "홍길동";
		int value = map.get(key); //키를 매개값으로 주면 값을 리턴
		System.out.println(key + ": " + value); //값이 대치된 것 확인
		System.out.println();
		
		//키 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String K = keyIterator.next();
			Integer V = map.get(K);
			System.out.println(K + " : " + V);
		}
		System.out.println();
		
		//엔트리 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			String K = entry.getKey();
			Integer V = entry.getValue();
			System.out.println(K + " : " + V);
		}
		System.out.println();
		
		//키로 엔트리 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println();
	}
}
