package ch15.lecture.p03set;

import java.util.*;

public class C02Iterator2 {
	public static void main(String[] args) {
		Set<Integer> number = new HashSet<>();
		
		number.add(97);
		number.add(00);
		number.add(96);
		number.add(94);
		
		
		Iterator<Integer> iter = number.iterator();
		while(iter.hasNext()) {
			Integer num = iter.next();
			System.out.println(num);
		}
		
		System.out.println("---------------");
		System.out.println(number);
		
		Iterator<Integer> iter2 = number.iterator();
		while(iter2.hasNext()) {
			
			int remov = iter2.next();
			
			if(remov % 2 == 1) {
				iter2.remove();
			} 
		}
		System.out.println("remove()------------");
		System.out.println(number);
	} 
}
