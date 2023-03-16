package ch15.sec08;

import java.util.*;

public class ImmutableExample {
	public static void main(String[] args) {
		//List 불변 컬렉션 생성
		List<String> immutableList1 = List.of("A", "B", "C");
//		immutableList1.add("D"); //X
		
		//Set 불변 컬렉션 생성
		Set<String> immutableSet1 = Set.of("A", "B", "C");
//		immutableSet1.remove("A");//X
		
		//Map 불변 컬렉션 생성
		//짝수 개의 파라미터 작성
		Map<Integer, String> immutableMap1 = Map.of(
				1, "A",
				2, "B",
				3, "C"
				);
//		immutableMap1.put(4, "D"); //X
		
		//List 컬렉션을 불변 컬렉션으로 복사
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		List<String> immutableList2 = List.copyOf(list);
		
		// 수정 가능한 리스트로 만들기-----------------------------------
		List<String> list2 = new ArrayList<>(immutableList2);
		list2.add("D");
		System.out.println(list2);
		
		//Set 컬렉션을 불변 컬렉션으로 복사
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		Set<String> immutableSet2 = Set.copyOf(set);
		
		//수정 가능한 셋 만들기------------------------------------------
		Set<String> set2 = new HashSet<>(immutableSet2);
		set2.add("E");
		System.out.println(set2);
	
		//Map 컬렉션을 불변 컬렉션으로 복사
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		Map<Integer, String> immutableMap2 = Map.copyOf(map);
		
		//수정 가능한 맵 만들기------------------------------------------
		Map<Integer, String> map2 = new HashMap<>(immutableMap2);
		map2.put(4, "D");
		System.out.println(map2);
		
		//배열로부터 List 불변 컬렉션 생성
		String[] arr = {"A", "B", "C" };
		List<String> immutableList3 = Arrays.asList(arr);
		//Array.asList : 사이즈가 고정되어 있음 때문에 사이즈를 변경시키는 add나 remove 불가
//		immutableList3.add("Z"); //X 추가 불가
		immutableList3.replaceAll(s -> s + s); //변경 가능
		System.out.println(immutableList3);
	
//		int[] arr2 = {3, 4, 5}; //자동 boxing 안되니까 처음부터 Integer라고 잘 써주기
		Integer[] arr2 = {3, 4, 5};
		List<Integer> list4 = Arrays.asList(arr2);
		
	}
}
