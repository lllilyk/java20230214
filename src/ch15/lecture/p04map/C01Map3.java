package ch15.lecture.p04map;

import java.util.*;

public class C01Map3 {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		
		map.put("kang", "yang");
		map.put("jung", "park");
		map.put("song", "lee");
		
		int size = map.size();
		System.out.println(size);
		
		map.put("kang", "chae");
		
		System.out.println(map.size());
		
		String v = map.get("jung");
		System.out.println(v);
		
		System.out.println(map.get("song"));
		
		map.remove("song");
		System.out.println(map.size());
		
		System.out.println("keyset 메소드-----------------");
		Set<String> keys = map.keySet(); //키 set 얻기
		for (String key : keys) {
			System.out.println((key + ":" + map.get(key)));
		}
		System.out.println();
		
		System.out.println("forEach 메소드----------------");
		map.forEach((k, s) -> System.out.println(k + ":" + s));
		System.out.println();
		
		//각 entry를 set으로 가지고 있는 놈을 리턴
		System.out.println("entrySet 메소드---------------");
		Set<Map.Entry<String, String>> entries = map.entrySet();
		for(Map.Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		
	}
}
