package ch15.lecture.p03set;

import java.util.*;

public class C02Iterator4 {
	public static void main(String[] args) {
		
		Set <Integer> age = new HashSet<>();
		
		age.add(60);
		age.add(59);
		age.add(27);
		
		System.out.println(age);
	
		System.out.println("Min : " + Collections.min(age));
		System.out.println("Max : " + Collections.max(age));
		
		Iterator<Integer> removeEven = age.iterator();
		while(removeEven.hasNext()) {
			
			int next = removeEven.next();
			
			if(next % 2 == 0 ) {
				removeEven.remove();
			}
		}
		System.out.println("age : " + age);
	}
}
