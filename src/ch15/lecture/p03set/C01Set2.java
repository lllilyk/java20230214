package ch15.lecture.p03set;

import java.util.*;

public class C01Set2 {
	public static void main(String[] args) {
		Set<String> Menu = new HashSet<>();
		
		Menu.add("sushi");
		Menu.add("pizza");
		Menu.add("pasta");
		Menu.add("salmon");
		
		System.out.println(Menu.size());
		System.out.println(Menu);
		
		System.out.println("remove--------------------");
		Menu.remove("pizza");
		System.out.println(Menu);
		
		//전체 탐색 - for
		System.out.println("for-----------------------");
		for(String everyThing : Menu) {
			System.out.println(everyThing);
		}
		
		//전체 탐색 - iterator
		System.out.println("iterator--------------------");
		Iterator<String> iterator = Menu.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//전체 탐색 - forEach
		System.out.println("forEach1--------------------");
		Menu.forEach(e -> System.out.println(e));
		
		System.out.println("forEach2--------------------");
		Menu.forEach(System.out::println);
	}
}
