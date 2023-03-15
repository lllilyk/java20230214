package ch15.lecture.p04map;

import java.util.*;

public class C01Map {
	public static void main(String[] args) {
		// map
		// (key, value) 쌍 entry를 저장
		// key는 중복되지 않음
		
		Map<String, String> map = new HashMap<>();
		
		//entry 추가(변경)
		map.put("kang", "slamdunk");
		map.put("serly", "avatar");
		map.put("maverick", "topgun");
		
		// entry의 수
		int size = map.size();
		System.out.println(size);
		
		map.put("kang", "baseball"); 
		//key는 중복되지 않으므로 추가x 기존의 slamdunk가 baseball로 바뀜
		
		System.out.println(map.size());

		//key로 value 얻기
		//get 메소드는 파라미터값으로 key를 넣어서 value를 얻을 수 있음
		String v1 = map.get("serly");
		System.out.println(v1);
		
		System.out.println(map.get("kang"));
		
		//entry 지우기 : remove 메소드
		map.remove("kang"); //파라미터값으로 key 넣기
		System.out.println(map.size());
	
		// 전체 탐색
		//key를 통해 value를 얻어낼 수 있음
		//순서 x
		//key는 set의 특징과 동일
		
		System.out.println("keyset 사용-------------------");
		Set<String> keys = map.keySet(); //키 set 얻기
		for (String key : keys) {
			System.out.println((key + ":" + map.get(key)));
		}
	
		System.out.println("forEach 메소드----------------");
		map.forEach((k, v) -> System.out.println(k + ":" + v));
		
		//각 entry를 set으로 가지고 있는 놈을 리턴
		System.out.println("entrySet메소드---------------");
		Set<Map.Entry<String, String>> entries = map.entrySet();
		for(Map.Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}
