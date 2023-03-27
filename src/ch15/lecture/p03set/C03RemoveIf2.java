package ch15.lecture.p03set;

import java.util.*;

public class C03RemoveIf2 {
	public static void main(String[] args) {
		Set <String> hmm = new HashSet<>();
		
		hmm.add("hangyodong");
		hmm.add("hellokitty");
		hmm.add("pochacco");
		hmm.add("kuromii");
		
		System.out.println(hmm);
		
		hmm.removeIf(e -> (e.length() %2 == 1));
		
		System.out.println(hmm);
	}
}
