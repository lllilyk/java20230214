package ch15.exercise.leetcode;

import java.util.*;

public class Solution2215 {
	public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
		//코드 작성
		//contains를 썼을 때 true가 나오는 값을 remove하면 될듯..
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		
		for (int n : nums1) {
			set1.add(n);
		}
		
		for (int n : nums2) {
			set2.add(n);
		}
		
		//왜 nums1, nums2로 바로 안 받았냐
		//set은 변경이 불가능하기 때문에
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		// code...
		list1.addAll(set1);
		list2.addAll(set2);
		
		list1.removeIf(set2::contains);
		list2.removeIf(set1::contains);
		
		return List.of(list1, list2);
	}
}
