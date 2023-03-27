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
		
		System.out.println("keySet 사용");
		Set<String> onlykey = map.keySet();
		for (String key : onlykey) {
			System.out.println((key + ": " + map.get(key)));
		}
	}
}
