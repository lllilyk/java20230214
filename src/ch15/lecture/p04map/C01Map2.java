 
package ch15.lecture.p04map;

import java.util.*;

public class C01Map2 {
	public static void main(String[] args) {
		Map<String, Integer> movie = new HashMap<>();
		
		movie.put("topgun", 202207);
		movie.put("avatar", 202211);
		movie.put("slamdunk", 202302);
		
		//System.out.println(movie.size());
		
		boolean a = movie.containsKey("topgun");
		//System.out.println(a);
		
		//중복 값 넣었을 때
		movie.put("slamdunk", 202301);
		//System.out.println(movie);
		
		//key로 value 얻기
		int i = movie.get("topgun");
		//System.out.println(i);
		
		//System.out.println(movie.get("slamdunk"));
		
		//주어진 키와 일치하는 Map.Entry 삭제
		movie.remove("avatar");
		//System.out.println(movie);
		
		//전체 탐색
		//1번-keySet 메소드 사용
		
		Set<String> keys = movie.keySet();

		for(String key : keys) {
		   //System.out.println((key + ":" + movie.get(key)));
		}
		
		//System.out.println("-----A와 aa-----");
		Set<String> A = movie.keySet();
		
		for(String aa : A) {
			//System.out.println(aa + " - " + movie.get(aa));
		}
		
		System.out.println("forEach");
		movie.forEach((k, v) -> System.out.println(k + ": " + v));
		
		System.out.println("entrySet");
		Set<Map.Entry<String, Integer>> entrySet = movie.entrySet();
		for(Map.Entry<String, Integer> entrySetValue : entrySet) {
			System.out.println(entrySetValue.getKey() + ": " + entrySetValue.getValue());
		}
	}
}
