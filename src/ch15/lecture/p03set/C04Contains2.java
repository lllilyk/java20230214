package ch15.lecture.p03set;

import java.util.*;

public class C04Contains2 {
	
	public static void main(String[] args) {
		Set <String> Sanrio = Set.of("Hellokitty", "Hangyodong", "Mymelody");
		
		System.out.println(Sanrio.contains("Hellokitty"));
		System.out.println(Sanrio.contains("Hangyodong"));
		System.out.println(Sanrio.contains("Mymelody"));
		System.out.println(Sanrio.contains("Kuromi"));
	
		System.out.println(Sanrio.contains(new String("Hangyodong")));
		System.out.println(Sanrio.contains(new String("Kurimanzu")));

		System.out.println(Sanrio);
	}
	
}
