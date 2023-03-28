package ch15.lecture.p03set;

import java.util.*;

public class C02Iterator3 {
	public static void main(String[] args) {

		Set<String> slamdunk = new HashSet<>();
		slamdunk.add("Kang");
		slamdunk.add("Jung");
		slamdunk.add("Song");
		slamdunk.add("chae");
		slamdunk.add("Seo");
		
		System.out.println(slamdunk);
		
		Iterator <String> removeSeo = slamdunk.iterator();
		while(removeSeo.hasNext()) {
			
			String aru = removeSeo.next();
			
			if(aru.length() % 2 == 1) {
				removeSeo.remove();
			}
		}
		System.out.println(slamdunk);
	}
}
